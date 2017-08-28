package youTubeHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.CommentThread;
import com.google.api.services.youtube.model.CommentThreadListResponse;
import com.google.api.services.youtube.model.PlaylistItemListResponse;
import com.google.api.services.youtube.model.PlaylistListResponse;
import com.google.common.collect.Lists;

public class YouTubeUtil {

    /**
     * Define a global instance of a YouTube object, which will be used to make YouTube Data API requests.
     */
    private static YouTube youtube;

    /**
     * This is a static helper class no instantiation.
     */
    private YouTubeUtil() {
    }

    private static YouTube getYouTubeObject() throws IOException {
        if (youtube == null) {
            // This OAuth 2.0 access scope allows for full read/write access to the
            // authenticated user's account and requires requests to use an SSL connection.
            List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.force-ssl");

            // Authorize the request.
            Credential credential;
            credential = YoutubeAuth.authorize(scopes, "commentthreads");

            // This object is used to make YouTube Data API requests.
            youtube = new YouTube.Builder(YoutubeAuth.HTTP_TRANSPORT, YoutubeAuth.JSON_FACTORY, credential).setApplicationName("CommentVampire")
                    .build();
        }
        return youtube;
    }

    /**
     * This so far only returns the first 20 comments under a given videoId... Need to make a loop that gets the nextPageToken and
     * iterates until less than 20 comments are returned.
     *
     * @param videoId
     * @return
     * @throws IOException
     */
    public static List<CommentThread> getAllComments(String videoId) throws IOException {


        // Call the YouTube Data API's commentThreads.list method to
        // retrieve video comment threads.
        String npToken = null;
        List<CommentThread> returnList = new ArrayList<CommentThread>();
        do {
            CommentThreadListResponse videoCommentsListResponse = getVideoCommentListResponse(videoId, npToken);
            npToken = videoCommentsListResponse.getNextPageToken();
            returnList.addAll(videoCommentsListResponse.getItems());
            // System.out.println("Size: " + returnList.size() + ", npToken: " + npToken);
        } while (npToken != null);

        return returnList;
    }

    private static CommentThreadListResponse getVideoCommentListResponse(String videoId, String pageToken) throws IOException {
        initialize();

        if (pageToken == null) {
            return youtube.commentThreads().list("snippet").setVideoId(videoId).setTextFormat("plainText").setMaxResults(100L).execute();
        } else {
            return youtube.commentThreads().list("snippet").setVideoId(videoId).setTextFormat("plainText").setMaxResults(100L)
                    .setPageToken(pageToken).execute();
        }
    }


    private static PlaylistListResponse getPlaylistsForChannel(String channelId, String pageToken) throws IOException {
        initialize();

        if (pageToken == null) {
            return youtube.playlists().list("snippet").setChannelId(channelId).setMaxResults(50L).execute();
        } else {
            return youtube.playlists().list("snippet").setChannelId(channelId).setPageToken(pageToken).setMaxResults(50L).execute();
        }
    }

    private static PlaylistItemListResponse getVideoIdsForPlaylist(String playlistId, String pageToken) throws IOException {
        initialize();

        if (pageToken == null) {
            return youtube.playlistItems().list("snippet").setPlaylistId(playlistId).setMaxResults(50L).execute();
        } else {
            return youtube.playlistItems().list("snippet").setPlaylistId(playlistId).setPageToken(pageToken).setMaxResults(50L).execute();
        }
    }


    private static void initialize() throws IOException {
        if (getYouTubeObject() == null) {
            throw new RuntimeException();
        }
    }
}

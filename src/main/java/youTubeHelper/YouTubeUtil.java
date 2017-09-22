package youTubeHelper;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.CommentThread;
import com.google.api.services.youtube.model.CommentThreadListResponse;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YouTubeUtil {

    /**
     * Define a global instance of a YouTube object, which will be used to make YouTube Data API requests.
     */
    private static YouTube youtube;

    public YouTubeUtil(YouTube youtube) {
        this.youtube = youtube;
    }

    public static YouTube getYouTubeObject() throws IOException {
        // This OAuth 2.0 access scope allows for full read/write access to the
        // authenticated user's account and requires requests to use an SSL connection.
        List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.force-ssl");

        // Authorize the request.
        Credential credential;
        credential = YoutubeAuth.authorize(scopes, "commentthreads");

        // This object is used to make YouTube Data API requests.
        return new YouTube.Builder(YoutubeAuth.HTTP_TRANSPORT, YoutubeAuth.JSON_FACTORY, credential).setApplicationName("CommentVampire")
                .build();

    }

    /*
        public static List<String> getVideoIdsFromPlayList(String playlistId) throws IOException {
            // Call the YouTube Data API's list method
            String npToken = null;
            List<PlaylistItem> returnList = new ArrayList<>();
            do {
                PlaylistItemListResponse playlistItemResponse = YouTubeUtil.getPlaylistItemsForPlaylist(playlistId, null);
                npToken = playlistItemResponse.getNextPageToken();
                returnList.addAll(playlistItemResponse.getItems());
            } while (npToken != null);
            List<String> videoIdList = new ArrayList<>();

            for (PlaylistItem item : returnList) {
                videoIdList.add(item.getContentDetails().getVideoId());
            }
            return videoIdList;
        }

        private static PlaylistItemListResponse getPlaylistItemsForPlaylist(String playlistId, String pageToken) throws IOException {

            if (pageToken == null) {
                pageToken = "";
            }

            return youtube.playlistItems()
                    .list("contentDetails")
                    .setPlaylistId(playlistId)
                    .setPageToken(pageToken)
                    .setMaxResults(50L)
                    .execute();
        }
    */
    private CommentThreadListResponse getVideoCommentListResponse(String videoId, String pageToken) throws IOException {
        if (pageToken == null) {
            pageToken = "";
        }
        return youtube.commentThreads()
                .list("snippet")
                .setVideoId(videoId)
                .setTextFormat("plainText")
                .setMaxResults(100L)
                .setPageToken(pageToken)
                .execute();

    }
    /*
    public List<Playlist> getPlaylists(String channelId) throws IOException {
        // Call the YouTube Data API's list method
        String npToken = null;
        List<Playlist> returnList = new ArrayList<>();
        do {
            PlaylistListResponse PlaylistListResponse = this.getPlaylistsResponseForChannel(channelId, npToken);
            npToken = PlaylistListResponse.getNextPageToken();
            returnList.addAll(PlaylistListResponse.getItems());
        } while (npToken != null);

        return returnList;
    }

    private PlaylistListResponse getPlaylistsResponseForChannel(String channelId, String pageToken) throws IOException {
        if (pageToken == null) {
            pageToken = "";
        }
        return youtube.playlists()
                .list("contentDetails")
                .setChannelId(channelId)
                .setPageToken(pageToken)
                .setMaxResults(50L)
                .execute();
    }*/

    /**
     * This returns all comments visible for your user under the given videoId
     *
     * @param videoId
     * @return
     * @throws IOException
     */
    public List<CommentThread> getAllComments(String videoId) throws IOException {
        // Call the YouTube Data API's commentThreads.list method to
        // retrieve video comment threads.
        String npToken = null;
        List<CommentThread> returnList = new ArrayList<CommentThread>();
        do {
            CommentThreadListResponse videoCommentsListResponse = getVideoCommentListResponse(videoId, npToken);
            npToken = videoCommentsListResponse.getNextPageToken();
            returnList.addAll(videoCommentsListResponse.getItems());
        } while (npToken != null);

        return returnList;
    }

    public List<String> getAllVideoIds(String channelId) throws IOException {
        // Call the YouTube Data API's search.list method to
        // retrieve video comment threads.
        String npToken = null;
        List<String> returnList = new ArrayList<>();
        do {
            SearchListResponse response = getVideoIds(channelId, npToken);
            response.getItems().forEach(item -> {
                returnList.add(item.getId().getVideoId());
            });
            npToken = response.getNextPageToken();
        } while (npToken != null);

        return returnList;

    }

    private SearchListResponse getVideoIds(String channelId, String pageToken) throws IOException {
        if (pageToken == null) {
            pageToken = "";
        }
        return youtube.search()
                .list("id")
                .setPageToken(pageToken)
                .setChannelId(channelId)
                .setMaxResults(50L)
                .execute();
    }


}

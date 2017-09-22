package GetCommentTests;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.CommentThread;
import com.google.api.services.youtube.model.SearchListResponse;
import databaseHelper.DatabaseUtil;
import youTubeHelper.YouTubeUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

public class Test_GetStuffFromYoutube {


    //@Test
    public void searchVideoIdsFromChannel() throws IOException {
        String channelId = "UCJ2yCFYUDiBJajga4tXRdNA";
        YouTube youtube = YouTubeUtil.getYouTubeObject();
        String npToken = null;

        SearchListResponse response = youtube.search()
                .list("id")
                .setPageToken("")
                .setChannelId(channelId)
                .setMaxResults(50L)
                .execute();
        List<String> videoIds = new ArrayList<>();
        response.getItems().forEach(item -> {
            videoIds.add(item.getId().getVideoId());
        });

    }

    //@Test
    public void getComments() throws IOException {
        YouTubeUtil util = new YouTubeUtil(YouTubeUtil.getYouTubeObject());
        try {
            // Video: Carmilla | S1 E16 "Best Laid Plans"
            // String videoId = "AHQshv_WFWA";

            // Having sex as a trans lesbian | Riley J. Dennis
            // String videoId = "d71qtY9jvto";
            String videoId = "rdyeqJO55fU";
            List<CommentThread> videoComments = util.getAllComments(videoId);
            if (videoComments.isEmpty()) {
                System.out.println("Can't get video comments.");
                fail();
            }

            DatabaseUtil.storeYoutubeComments(videoComments);

        } catch (GoogleJsonResponseException e) {
            System.err.println("GoogleJsonResponseException code: " + e.getDetails().getCode() + " : " + e.getDetails().getMessage());
            e.printStackTrace();
            fail();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
            e.printStackTrace();
            fail();
        } catch (Throwable t) {
            System.err.println("Throwable: " + t.getMessage());
            t.printStackTrace();
            fail();
        }
    }

}

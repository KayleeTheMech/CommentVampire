package GetCommentTests;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.api.services.youtube.model.*;
import org.junit.Test;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;

import databaseHelper.DatabaseUtil;
import youTubeHelper.YouTubeUtil;

public class Test_GetStuffFromYoutube {


    @Test
    public void getVideoIds() throws IOException {
        String playlistId = "PL6orzhPfnuvm50VI9r7vi3nxqV9PTHRbB";
        List<String> videoIdList= YouTubeUtil.getVideoIds(playlistId);
        System.out.println(videoIdList);

    }

    //@Test
    public void getPlaylists() throws IOException {
        String channelId = "UCxFWzKZa74SyAqpJyVlG5Ew";

        List<Playlist> returnList = YouTubeUtil.getPlaylists(channelId);
        for (Playlist item : returnList) {
            String playlistId = item.getId();
            System.out.println(playlistId);
        }

    }

    //@Test
    public void getComments() {

        try {
            // Video: Carmilla | S1 E16 "Best Laid Plans"
            // String videoId = "AHQshv_WFWA";

            // Having sex as a trans lesbian | Riley J. Dennis
            // String videoId = "d71qtY9jvto";
            String videoId = "rdyeqJO55fU";
            List<CommentThread> videoComments = YouTubeUtil.getAllComments(videoId);
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

package GetCommentTests;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.services.youtube.model.CommentSnippet;
import com.google.api.services.youtube.model.CommentThread;

import youTubeHelper.YouTubeUtil;

public class Test_GetFirstCommentsAndNextPageToken {

  @Test
  public void getComments() {

    try {
      // Video: Carmilla | S1 E16 "Best Laid Plans"
      String videoId = "AHQshv_WFWA";

      List<CommentThread> videoComments = YouTubeUtil.getAllComments(videoId);
      if (videoComments.isEmpty()) {
        System.out.println("Can't get video comments.");
        fail();
      } else {
        // Print information from the API response.
        System.out.println("\n================== Returned Video Comments ==================\n");
        for (CommentThread videoComment : videoComments) {
          CommentSnippet snippet = videoComment.getSnippet().getTopLevelComment().getSnippet();
          System.out.println("  - Author: " + snippet.getAuthorDisplayName());
          System.out.println("  - Comment: " + snippet.getTextDisplay());
          System.out.println("\n-------------------------------------------------------------\n");
        }
        System.out.println("Collected: " + videoComments.size() + " comments");
      }

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

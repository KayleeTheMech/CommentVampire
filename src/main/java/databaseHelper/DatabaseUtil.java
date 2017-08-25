/**
 * 
 */
package databaseHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.google.api.services.youtube.model.Comment;
import com.google.api.services.youtube.model.CommentThread;

public class DatabaseUtil {

  public static void storeYoutubeComments(List<CommentThread> videoComments) throws SQLException {

    if (videoComments.isEmpty()) {
      throw new RuntimeException("No comments to upload");
    }

    PreparedStatement statement;

    statement = getConnection().prepareStatement(
        "INSERT INTO haeqs_trolle.YoutubeComments (youtubeCommentId, videoId, authorUserID, authorDisplayName, commentText) VALUES (?,?,?,?,?)");
    int alreadyloaded = 0;
    int added = 0;
    for (int i = 0; i < videoComments.size(); i++) {
      CommentThread videoComment = videoComments.get(i);
      Comment comment = videoComment.getSnippet().getTopLevelComment();
      try {
        statement.setString(1, comment.getId());
        statement.setString(2, comment.getSnippet().getVideoId());
        statement.setString(3, comment.getSnippet().getChannelId());
        statement.setString(4, comment.getSnippet().getAuthorDisplayName());
        statement.setString(5, comment.getSnippet().getTextDisplay());
        statement.executeUpdate();
        added++;
      } catch (SQLException e) {
        if (e.getSQLState().equals("23000") && e.getMessage().startsWith("Duplicate entry")) {
          alreadyloaded++;
          statement.clearBatch();
        } else
          throw e;
      }

    }
    statement.close();
    System.out.println("From a total " + videoComments.size() + "  comments " + added + " were uploaded to the DB.");
    System.out.println("Identical " + alreadyloaded + " comments were already in the DB.");
  }

  public static Connection getConnection() throws SQLException {
    InputStream stream = null;
    try {
      stream = DatabaseUtil.class.getResourceAsStream("/mysql_server.properties");
      Properties properties = new Properties();
      properties.load(stream);
      stream.close();
      final String serverURI = "jdbc:mysql://" + properties.getProperty("serverAddress");
      return DriverManager.getConnection(serverURI, properties.getProperty("databaseUser"), properties.getProperty("databasePass"));
    } catch (IOException e) {
      throw new RuntimeException("Couldn't read mysql_server.properties file");
    }
  }

}

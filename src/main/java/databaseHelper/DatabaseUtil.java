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

  private static final int BATCH_SIZE = 50;

  public static void storeYoutubeComments(List<CommentThread> videoComments) throws SQLException {

    if (videoComments.isEmpty()) {
      throw new RuntimeException("No comments to upload");
    }

    PreparedStatement statement;

    statement = getConnection().prepareStatement(
        "INSERT INTO haeqs_trolle.YoutubeComments (youtubeCommentId, videoId, authorUserID, authorDisplayName, commentText) VALUES (?,?,?,?,?)");

    for (int i = 0; i < videoComments.size(); i++) {
      CommentThread videoComment = videoComments.get(i);
      Comment comment = videoComment.getSnippet().getTopLevelComment();
      statement.setString(1, comment.getId());
      statement.setString(2, comment.getSnippet().getVideoId());
      statement.setString(3, comment.getSnippet().getChannelId());
      statement.setString(4, comment.getSnippet().getAuthorDisplayName());
      statement.setString(5, comment.getSnippet().getTextDisplay());
      statement.addBatch();
      if (i % BATCH_SIZE == 0) {
        statement.executeBatch();
      }
    }
    statement.executeBatch();
    statement.executeUpdate();
    statement.close();

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

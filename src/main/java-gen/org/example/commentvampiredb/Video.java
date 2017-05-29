package org.example.commentvampiredb;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Video</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "commentVampireDb_Video")
public class Video {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int s_id = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private User user = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String videoId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String videoDescription = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String videoTitle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String channelId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int viewCount = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int likeCount = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int dislikeCount = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int favoriteCount = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int commentCount = 0;

  /**
   * Returns the value of '<em><b>s_id</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>s_id</b></em>' feature
   * @generated
   */
  public int getS_id() {
    return s_id;
  }

  /**
   * Sets the '{@link Video#getS_id() <em>s_id</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newS_id
   *          the new value of the '{@link Video#getS_id() s_id}' feature.
   * @generated
   */
  public void setS_id(int newS_id) {
    s_id = newS_id;
  }

  /**
   * Returns the value of '<em><b>user</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>user</b></em>' feature
   * @generated
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the '{@link Video#getUser() <em>user</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUser
   *          the new value of the '{@link Video#getUser() user}' feature.
   * @generated
   */
  public void setUser(User newUser) {
    user = newUser;
  }

  /**
   * Returns the value of '<em><b>videoId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>videoId</b></em>' feature
   * @generated
   */
  public String getVideoId() {
    return videoId;
  }

  /**
   * Sets the '{@link Video#getVideoId() <em>videoId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVideoId
   *          the new value of the '{@link Video#getVideoId() videoId}' feature.
   * @generated
   */
  public void setVideoId(String newVideoId) {
    videoId = newVideoId;
  }

  /**
   * Returns the value of '<em><b>videoDescription</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>videoDescription</b></em>' feature
   * @generated
   */
  public String getVideoDescription() {
    return videoDescription;
  }

  /**
   * Sets the '{@link Video#getVideoDescription() <em>videoDescription</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVideoDescription
   *          the new value of the '{@link Video#getVideoDescription() videoDescription}' feature.
   * @generated
   */
  public void setVideoDescription(String newVideoDescription) {
    videoDescription = newVideoDescription;
  }

  /**
   * Returns the value of '<em><b>videoTitle</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>videoTitle</b></em>' feature
   * @generated
   */
  public String getVideoTitle() {
    return videoTitle;
  }

  /**
   * Sets the '{@link Video#getVideoTitle() <em>videoTitle</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVideoTitle
   *          the new value of the '{@link Video#getVideoTitle() videoTitle}' feature.
   * @generated
   */
  public void setVideoTitle(String newVideoTitle) {
    videoTitle = newVideoTitle;
  }

  /**
   * Returns the value of '<em><b>channelId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>channelId</b></em>' feature
   * @generated
   */
  public String getChannelId() {
    return channelId;
  }

  /**
   * Sets the '{@link Video#getChannelId() <em>channelId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newChannelId
   *          the new value of the '{@link Video#getChannelId() channelId}' feature.
   * @generated
   */
  public void setChannelId(String newChannelId) {
    channelId = newChannelId;
  }

  /**
   * Returns the value of '<em><b>viewCount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>viewCount</b></em>' feature
   * @generated
   */
  public int getViewCount() {
    return viewCount;
  }

  /**
   * Sets the '{@link Video#getViewCount() <em>viewCount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newViewCount
   *          the new value of the '{@link Video#getViewCount() viewCount}' feature.
   * @generated
   */
  public void setViewCount(int newViewCount) {
    viewCount = newViewCount;
  }

  /**
   * Returns the value of '<em><b>likeCount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>likeCount</b></em>' feature
   * @generated
   */
  public int getLikeCount() {
    return likeCount;
  }

  /**
   * Sets the '{@link Video#getLikeCount() <em>likeCount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLikeCount
   *          the new value of the '{@link Video#getLikeCount() likeCount}' feature.
   * @generated
   */
  public void setLikeCount(int newLikeCount) {
    likeCount = newLikeCount;
  }

  /**
   * Returns the value of '<em><b>dislikeCount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dislikeCount</b></em>' feature
   * @generated
   */
  public int getDislikeCount() {
    return dislikeCount;
  }

  /**
   * Sets the '{@link Video#getDislikeCount() <em>dislikeCount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDislikeCount
   *          the new value of the '{@link Video#getDislikeCount() dislikeCount}' feature.
   * @generated
   */
  public void setDislikeCount(int newDislikeCount) {
    dislikeCount = newDislikeCount;
  }

  /**
   * Returns the value of '<em><b>favoriteCount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>favoriteCount</b></em>' feature
   * @generated
   */
  public int getFavoriteCount() {
    return favoriteCount;
  }

  /**
   * Sets the '{@link Video#getFavoriteCount() <em>favoriteCount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFavoriteCount
   *          the new value of the '{@link Video#getFavoriteCount() favoriteCount}' feature.
   * @generated
   */
  public void setFavoriteCount(int newFavoriteCount) {
    favoriteCount = newFavoriteCount;
  }

  /**
   * Returns the value of '<em><b>commentCount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>commentCount</b></em>' feature
   * @generated
   */
  public int getCommentCount() {
    return commentCount;
  }

  /**
   * Sets the '{@link Video#getCommentCount() <em>commentCount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCommentCount
   *          the new value of the '{@link Video#getCommentCount() commentCount}' feature.
   * @generated
   */
  public void setCommentCount(int newCommentCount) {
    commentCount = newCommentCount;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Video " + " [s_id: " + getS_id() + "]" + " [videoId: " + getVideoId() + "]" + " [videoDescription: " + getVideoDescription()
        + "]" + " [videoTitle: " + getVideoTitle() + "]" + " [channelId: " + getChannelId() + "]" + " [viewCount: " + getViewCount() + "]"
        + " [likeCount: " + getLikeCount() + "]" + " [dislikeCount: " + getDislikeCount() + "]" + " [favoriteCount: " + getFavoriteCount()
        + "]" + " [commentCount: " + getCommentCount() + "]";
  }
}

package org.example.commentvampiredb;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * A representation of the model object '<em><b>Comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "commentVampireDb_Comment")
public class Comment {

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
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private Video video = null;

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
  @Basic()
  private String commentId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String parentId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String textDisplay = null;

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
  @Temporal(TemporalType.DATE)
  private Date publishedAt = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Temporal(TemporalType.DATE)
  private Date updatedAt = null;

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
   * Sets the '{@link Comment#getUser() <em>user</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUser
   *          the new value of the '{@link Comment#getUser() user}' feature.
   * @generated
   */
  public void setUser(User newUser) {
    user = newUser;
  }

  /**
   * Returns the value of '<em><b>video</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>video</b></em>' feature
   * @generated
   */
  public Video getVideo() {
    return video;
  }

  /**
   * Sets the '{@link Comment#getVideo() <em>video</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVideo
   *          the new value of the '{@link Comment#getVideo() video}' feature.
   * @generated
   */
  public void setVideo(Video newVideo) {
    video = newVideo;
  }

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
   * Sets the '{@link Comment#getS_id() <em>s_id</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newS_id
   *          the new value of the '{@link Comment#getS_id() s_id}' feature.
   * @generated
   */
  public void setS_id(int newS_id) {
    s_id = newS_id;
  }

  /**
   * Returns the value of '<em><b>commentId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>commentId</b></em>' feature
   * @generated
   */
  public String getCommentId() {
    return commentId;
  }

  /**
   * Sets the '{@link Comment#getCommentId() <em>commentId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCommentId
   *          the new value of the '{@link Comment#getCommentId() commentId}' feature.
   * @generated
   */
  public void setCommentId(String newCommentId) {
    commentId = newCommentId;
  }

  /**
   * Returns the value of '<em><b>parentId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parentId</b></em>' feature
   * @generated
   */
  public String getParentId() {
    return parentId;
  }

  /**
   * Sets the '{@link Comment#getParentId() <em>parentId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newParentId
   *          the new value of the '{@link Comment#getParentId() parentId}' feature.
   * @generated
   */
  public void setParentId(String newParentId) {
    parentId = newParentId;
  }

  /**
   * Returns the value of '<em><b>textDisplay</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>textDisplay</b></em>' feature
   * @generated
   */
  public String getTextDisplay() {
    return textDisplay;
  }

  /**
   * Sets the '{@link Comment#getTextDisplay() <em>textDisplay</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTextDisplay
   *          the new value of the '{@link Comment#getTextDisplay() textDisplay}' feature.
   * @generated
   */
  public void setTextDisplay(String newTextDisplay) {
    textDisplay = newTextDisplay;
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
   * Sets the '{@link Comment#getLikeCount() <em>likeCount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLikeCount
   *          the new value of the '{@link Comment#getLikeCount() likeCount}' feature.
   * @generated
   */
  public void setLikeCount(int newLikeCount) {
    likeCount = newLikeCount;
  }

  /**
   * Returns the value of '<em><b>publishedAt</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>publishedAt</b></em>' feature
   * @generated
   */
  public Date getPublishedAt() {
    return publishedAt;
  }

  /**
   * Sets the '{@link Comment#getPublishedAt() <em>publishedAt</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPublishedAt
   *          the new value of the '{@link Comment#getPublishedAt() publishedAt}' feature.
   * @generated
   */
  public void setPublishedAt(Date newPublishedAt) {
    publishedAt = newPublishedAt;
  }

  /**
   * Returns the value of '<em><b>updatedAt</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>updatedAt</b></em>' feature
   * @generated
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the '{@link Comment#getUpdatedAt() <em>updatedAt</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUpdatedAt
   *          the new value of the '{@link Comment#getUpdatedAt() updatedAt}' feature.
   * @generated
   */
  public void setUpdatedAt(Date newUpdatedAt) {
    updatedAt = newUpdatedAt;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Comment " + " [s_id: " + getS_id() + "]" + " [commentId: " + getCommentId() + "]" + " [parentId: " + getParentId() + "]"
        + " [textDisplay: " + getTextDisplay() + "]" + " [likeCount: " + getLikeCount() + "]" + " [publishedAt: " + getPublishedAt() + "]"
        + " [updatedAt: " + getUpdatedAt() + "]";
  }
}

package org.example.commentvampiredb;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>User</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "commentVampireDb_User")
public class User {

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
  private String authorDisplayName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String authorProfilImageUrl = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String authorChannelUrl = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String authorChannelId = null;

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
   * Sets the '{@link User#getS_id() <em>s_id</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newS_id
   *          the new value of the '{@link User#getS_id() s_id}' feature.
   * @generated
   */
  public void setS_id(int newS_id) {
    s_id = newS_id;
  }

  /**
   * Returns the value of '<em><b>authorDisplayName</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authorDisplayName</b></em>' feature
   * @generated
   */
  public String getAuthorDisplayName() {
    return authorDisplayName;
  }

  /**
   * Sets the '{@link User#getAuthorDisplayName() <em>authorDisplayName</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthorDisplayName
   *          the new value of the '{@link User#getAuthorDisplayName() authorDisplayName}' feature.
   * @generated
   */
  public void setAuthorDisplayName(String newAuthorDisplayName) {
    authorDisplayName = newAuthorDisplayName;
  }

  /**
   * Returns the value of '<em><b>authorProfilImageUrl</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authorProfilImageUrl</b></em>' feature
   * @generated
   */
  public String getAuthorProfilImageUrl() {
    return authorProfilImageUrl;
  }

  /**
   * Sets the '{@link User#getAuthorProfilImageUrl() <em>authorProfilImageUrl</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthorProfilImageUrl
   *          the new value of the '{@link User#getAuthorProfilImageUrl() authorProfilImageUrl}' feature.
   * @generated
   */
  public void setAuthorProfilImageUrl(String newAuthorProfilImageUrl) {
    authorProfilImageUrl = newAuthorProfilImageUrl;
  }

  /**
   * Returns the value of '<em><b>authorChannelUrl</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authorChannelUrl</b></em>' feature
   * @generated
   */
  public String getAuthorChannelUrl() {
    return authorChannelUrl;
  }

  /**
   * Sets the '{@link User#getAuthorChannelUrl() <em>authorChannelUrl</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthorChannelUrl
   *          the new value of the '{@link User#getAuthorChannelUrl() authorChannelUrl}' feature.
   * @generated
   */
  public void setAuthorChannelUrl(String newAuthorChannelUrl) {
    authorChannelUrl = newAuthorChannelUrl;
  }

  /**
   * Returns the value of '<em><b>authorChannelId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authorChannelId</b></em>' feature
   * @generated
   */
  public String getAuthorChannelId() {
    return authorChannelId;
  }

  /**
   * Sets the '{@link User#getAuthorChannelId() <em>authorChannelId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthorChannelId
   *          the new value of the '{@link User#getAuthorChannelId() authorChannelId}' feature.
   * @generated
   */
  public void setAuthorChannelId(String newAuthorChannelId) {
    authorChannelId = newAuthorChannelId;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "User " + " [s_id: " + getS_id() + "]" + " [authorDisplayName: " + getAuthorDisplayName() + "]" + " [authorProfilImageUrl: "
        + getAuthorProfilImageUrl() + "]" + " [authorChannelUrl: " + getAuthorChannelUrl() + "]" + " [authorChannelId: "
        + getAuthorChannelId() + "]";
  }
}

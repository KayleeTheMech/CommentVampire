package org.example.commentvampiredb;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: commentVampireDb. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CommentVampireDbModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case CommentVampireDbModelPackage.COMMENT_CLASSIFIER_ID:
        return createComment();
      case CommentVampireDbModelPackage.USER_CLASSIFIER_ID:
        return createUser();
      case CommentVampireDbModelPackage.VIDEO_CLASSIFIER_ID:
        return createVideo();
      default:
        throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public <T> ModelObject<T> createModelObject(EClass eClass, T adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
      case CommentVampireDbModelPackage.COMMENT_CLASSIFIER_ID:
        modelObject = new CommentModelObject();
        break;
      case CommentVampireDbModelPackage.USER_CLASSIFIER_ID:
        modelObject = new UserModelObject();
        break;
      case CommentVampireDbModelPackage.VIDEO_CLASSIFIER_ID:
        modelObject = new VideoModelObject();
        break;
      default:
        throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return (ModelObject<T>) modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   *
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a new one is
   * created and <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Comment
   * @generated
   */
  public Comment createComment() {
    return new Comment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass User
   * @generated
   */
  public User createUser() {
    return new User();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Video
   * @generated
   */
  public Video createVideo() {
    return new Video();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
      default:
        throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
      default:
        throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Comment</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class CommentModelObject<E extends Comment> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return CommentVampireDbModelPackage.INSTANCE.getCommentEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CommentVampireDbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Comment.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case CommentVampireDbModelPackage.COMMENT_USER_FEATURE_ID:
          return getTarget().getUser();
        case CommentVampireDbModelPackage.COMMENT_VIDEO_FEATURE_ID:
          return getTarget().getVideo();
        case CommentVampireDbModelPackage.COMMENT_S_ID_FEATURE_ID:
          return getTarget().getS_id();
        case CommentVampireDbModelPackage.COMMENT_COMMENTID_FEATURE_ID:
          return getTarget().getCommentId();
        case CommentVampireDbModelPackage.COMMENT_PARENTID_FEATURE_ID:
          return getTarget().getParentId();
        case CommentVampireDbModelPackage.COMMENT_TEXTDISPLAY_FEATURE_ID:
          return getTarget().getTextDisplay();
        case CommentVampireDbModelPackage.COMMENT_LIKECOUNT_FEATURE_ID:
          return getTarget().getLikeCount();
        case CommentVampireDbModelPackage.COMMENT_PUBLISHEDAT_FEATURE_ID:
          return getTarget().getPublishedAt();
        case CommentVampireDbModelPackage.COMMENT_UPDATEDAT_FEATURE_ID:
          return getTarget().getUpdatedAt();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case CommentVampireDbModelPackage.COMMENT_USER_FEATURE_ID:
          getTarget().setUser((User) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_VIDEO_FEATURE_ID:
          getTarget().setVideo((Video) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_S_ID_FEATURE_ID:
          getTarget().setS_id((Integer) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_COMMENTID_FEATURE_ID:
          getTarget().setCommentId((String) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_PARENTID_FEATURE_ID:
          getTarget().setParentId((String) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_TEXTDISPLAY_FEATURE_ID:
          getTarget().setTextDisplay((String) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_LIKECOUNT_FEATURE_ID:
          getTarget().setLikeCount((Integer) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_PUBLISHEDAT_FEATURE_ID:
          getTarget().setPublishedAt((Date) value);
          return;
        case CommentVampireDbModelPackage.COMMENT_UPDATEDAT_FEATURE_ID:
          getTarget().setUpdatedAt((Date) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>User</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class UserModelObject<E extends User> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return CommentVampireDbModelPackage.INSTANCE.getUserEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CommentVampireDbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return User.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case CommentVampireDbModelPackage.USER_S_ID_FEATURE_ID:
          return getTarget().getS_id();
        case CommentVampireDbModelPackage.USER_AUTHORDISPLAYNAME_FEATURE_ID:
          return getTarget().getAuthorDisplayName();
        case CommentVampireDbModelPackage.USER_AUTHORPROFILIMAGEURL_FEATURE_ID:
          return getTarget().getAuthorProfilImageUrl();
        case CommentVampireDbModelPackage.USER_AUTHORCHANNELURL_FEATURE_ID:
          return getTarget().getAuthorChannelUrl();
        case CommentVampireDbModelPackage.USER_AUTHORCHANNELID_FEATURE_ID:
          return getTarget().getAuthorChannelId();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case CommentVampireDbModelPackage.USER_S_ID_FEATURE_ID:
          getTarget().setS_id((Integer) value);
          return;
        case CommentVampireDbModelPackage.USER_AUTHORDISPLAYNAME_FEATURE_ID:
          getTarget().setAuthorDisplayName((String) value);
          return;
        case CommentVampireDbModelPackage.USER_AUTHORPROFILIMAGEURL_FEATURE_ID:
          getTarget().setAuthorProfilImageUrl((String) value);
          return;
        case CommentVampireDbModelPackage.USER_AUTHORCHANNELURL_FEATURE_ID:
          getTarget().setAuthorChannelUrl((String) value);
          return;
        case CommentVampireDbModelPackage.USER_AUTHORCHANNELID_FEATURE_ID:
          getTarget().setAuthorChannelId((String) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Video</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class VideoModelObject<E extends Video> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return CommentVampireDbModelPackage.INSTANCE.getVideoEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CommentVampireDbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Video.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case CommentVampireDbModelPackage.VIDEO_S_ID_FEATURE_ID:
          return getTarget().getS_id();
        case CommentVampireDbModelPackage.VIDEO_USER_FEATURE_ID:
          return getTarget().getUser();
        case CommentVampireDbModelPackage.VIDEO_VIDEOID_FEATURE_ID:
          return getTarget().getVideoId();
        case CommentVampireDbModelPackage.VIDEO_VIDEODESCRIPTION_FEATURE_ID:
          return getTarget().getVideoDescription();
        case CommentVampireDbModelPackage.VIDEO_VIDEOTITLE_FEATURE_ID:
          return getTarget().getVideoTitle();
        case CommentVampireDbModelPackage.VIDEO_CHANNELID_FEATURE_ID:
          return getTarget().getChannelId();
        case CommentVampireDbModelPackage.VIDEO_VIEWCOUNT_FEATURE_ID:
          return getTarget().getViewCount();
        case CommentVampireDbModelPackage.VIDEO_LIKECOUNT_FEATURE_ID:
          return getTarget().getLikeCount();
        case CommentVampireDbModelPackage.VIDEO_DISLIKECOUNT_FEATURE_ID:
          return getTarget().getDislikeCount();
        case CommentVampireDbModelPackage.VIDEO_FAVORITECOUNT_FEATURE_ID:
          return getTarget().getFavoriteCount();
        case CommentVampireDbModelPackage.VIDEO_COMMENTCOUNT_FEATURE_ID:
          return getTarget().getCommentCount();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case CommentVampireDbModelPackage.VIDEO_S_ID_FEATURE_ID:
          getTarget().setS_id((Integer) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_USER_FEATURE_ID:
          getTarget().setUser((User) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_VIDEOID_FEATURE_ID:
          getTarget().setVideoId((String) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_VIDEODESCRIPTION_FEATURE_ID:
          getTarget().setVideoDescription((String) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_VIDEOTITLE_FEATURE_ID:
          getTarget().setVideoTitle((String) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_CHANNELID_FEATURE_ID:
          getTarget().setChannelId((String) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_VIEWCOUNT_FEATURE_ID:
          getTarget().setViewCount((Integer) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_LIKECOUNT_FEATURE_ID:
          getTarget().setLikeCount((Integer) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_DISLIKECOUNT_FEATURE_ID:
          getTarget().setDislikeCount((Integer) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_FAVORITECOUNT_FEATURE_ID:
          getTarget().setFavoriteCount((Integer) value);
          return;
        case CommentVampireDbModelPackage.VIDEO_COMMENTCOUNT_FEATURE_ID:
          getTarget().setCommentCount((Integer) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}

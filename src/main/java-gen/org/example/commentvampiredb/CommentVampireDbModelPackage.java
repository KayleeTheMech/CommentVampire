package org.example.commentvampiredb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.example.commentvampiredb.dao.CommentDao;
import org.example.commentvampiredb.dao.UserDao;
import org.example.commentvampiredb.dao.VideoDao;

/**
 * The <b>Package</b> for the model '<em><b>commentVampireDb</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CommentVampireDbModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.example.org/commentVampireDb";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CommentVampireDbModelFactory MODELFACTORY = new CommentVampireDbModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_USER_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_VIDEO_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_S_ID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_COMMENTID_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_PARENTID_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_TEXTDISPLAY_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_LIKECOUNT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_PUBLISHEDAT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_UPDATEDAT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_S_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_AUTHORDISPLAYNAME_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_AUTHORPROFILIMAGEURL_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_AUTHORCHANNELURL_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_AUTHORCHANNELID_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_S_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_USER_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_VIDEOID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_VIDEODESCRIPTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_VIDEOTITLE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_CHANNELID_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_VIEWCOUNT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_LIKECOUNT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_DISLIKECOUNT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_FAVORITECOUNT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEO_COMMENTCOUNT_FEATURE_ID = 10;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CommentVampireDbModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return an initialized instance of this class
   *
   * @generated
   */
  public static CommentVampireDbModelPackage initialize() {

    if (isInitialized) {
      return (CommentVampireDbModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final CommentVampireDbModelPackage modelPackage = new CommentVampireDbModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Comment.class, modelPackage.getCommentEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(User.class, modelPackage.getUserEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Video.class, modelPackage.getVideoEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Comment.class, CommentDao.class);
    DaoRegistry.getInstance().registerDao(User.class, UserDao.class);
    DaoRegistry.getInstance().registerDao(Video.class, VideoDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the {@link CommentVampireDbModelFactory} instance.
   * @generated
   */
  @Override
  public CommentVampireDbModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "commentVampireDb.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Comment</b></em>'
   * @generated
   */
  public EClass getCommentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.user</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.user</b></em>'.
   * @generated
   */
  public EReference getComment_User() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_USER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.video</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.video</b></em>'.
   * @generated
   */
  public EReference getComment_Video() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_VIDEO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.s_id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.s_id</b></em>'.
   * @generated
   */
  public EAttribute getComment_S_id() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_S_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.commentId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.commentId</b></em>'.
   * @generated
   */
  public EAttribute getComment_CommentId() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_COMMENTID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.parentId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.parentId</b></em>'.
   * @generated
   */
  public EAttribute getComment_ParentId() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_PARENTID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.textDisplay</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.textDisplay</b></em>'.
   * @generated
   */
  public EAttribute getComment_TextDisplay() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_TEXTDISPLAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.likeCount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.likeCount</b></em>'.
   * @generated
   */
  public EAttribute getComment_LikeCount() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_LIKECOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.publishedAt</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.publishedAt</b></em>'.
   * @generated
   */
  public EAttribute getComment_PublishedAt() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_PUBLISHEDAT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.updatedAt</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.updatedAt</b></em>'.
   * @generated
   */
  public EAttribute getComment_UpdatedAt() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_UPDATEDAT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>User</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>User</b></em>'
   * @generated
   */
  public EClass getUserEClass() {
    return (EClass) getEPackage().getEClassifiers().get(USER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.s_id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.s_id</b></em>'.
   * @generated
   */
  public EAttribute getUser_S_id() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_S_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.authorDisplayName</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.authorDisplayName</b></em>'.
   * @generated
   */
  public EAttribute getUser_AuthorDisplayName() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_AUTHORDISPLAYNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.authorProfilImageUrl</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.authorProfilImageUrl</b></em>'.
   * @generated
   */
  public EAttribute getUser_AuthorProfilImageUrl() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_AUTHORPROFILIMAGEURL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.authorChannelUrl</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.authorChannelUrl</b></em>'.
   * @generated
   */
  public EAttribute getUser_AuthorChannelUrl() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_AUTHORCHANNELURL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.authorChannelId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.authorChannelId</b></em>'.
   * @generated
   */
  public EAttribute getUser_AuthorChannelId() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_AUTHORCHANNELID_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Video</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Video</b></em>'
   * @generated
   */
  public EClass getVideoEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VIDEO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.s_id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.s_id</b></em>'.
   * @generated
   */
  public EAttribute getVideo_S_id() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_S_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.user</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.user</b></em>'.
   * @generated
   */
  public EReference getVideo_User() {
    return (EReference) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_USER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.videoId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.videoId</b></em>'.
   * @generated
   */
  public EAttribute getVideo_VideoId() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_VIDEOID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.videoDescription</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.videoDescription</b></em>'.
   * @generated
   */
  public EAttribute getVideo_VideoDescription() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_VIDEODESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.videoTitle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.videoTitle</b></em>'.
   * @generated
   */
  public EAttribute getVideo_VideoTitle() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_VIDEOTITLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.channelId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.channelId</b></em>'.
   * @generated
   */
  public EAttribute getVideo_ChannelId() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_CHANNELID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.viewCount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.viewCount</b></em>'.
   * @generated
   */
  public EAttribute getVideo_ViewCount() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_VIEWCOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.likeCount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.likeCount</b></em>'.
   * @generated
   */
  public EAttribute getVideo_LikeCount() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_LIKECOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.dislikeCount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.dislikeCount</b></em>'.
   * @generated
   */
  public EAttribute getVideo_DislikeCount() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_DISLIKECOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.favoriteCount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.favoriteCount</b></em>'.
   * @generated
   */
  public EAttribute getVideo_FavoriteCount() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_FAVORITECOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Video.commentCount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Video.commentCount</b></em>'.
   * @generated
   */
  public EAttribute getVideo_CommentCount() {
    return (EAttribute) getVideoEClass().getEAllStructuralFeatures().get(VIDEO_COMMENTCOUNT_FEATURE_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
      case COMMENT_CLASSIFIER_ID:
        return Comment.class;
      case USER_CLASSIFIER_ID:
        return User.class;
      case VIDEO_CLASSIFIER_ID:
        return Video.class;
      default:
        throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}

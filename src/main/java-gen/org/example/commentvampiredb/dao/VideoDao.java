package org.example.commentvampiredb.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.example.commentvampiredb.CommentVampireDbModelPackage;
import org.example.commentvampiredb.Video;

/**
 * The Dao implementation for the model object '<em><b>Video</b></em>'.
 *
 * @generated
 */
public class VideoDao extends BaseDao<Video> {

  /**
   * @generated
   */
  @Override
  public Class<Video> getEntityClass() {
    return Video.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CommentVampireDbModelPackage.INSTANCE.getVideoEClass();
  }
}

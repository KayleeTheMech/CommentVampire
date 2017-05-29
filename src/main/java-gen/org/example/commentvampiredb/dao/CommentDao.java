package org.example.commentvampiredb.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.example.commentvampiredb.Comment;
import org.example.commentvampiredb.CommentVampireDbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Comment</b></em>'.
 *
 * @generated
 */
public class CommentDao extends BaseDao<Comment> {

  /**
   * @generated
   */
  @Override
  public Class<Comment> getEntityClass() {
    return Comment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CommentVampireDbModelPackage.INSTANCE.getCommentEClass();
  }
}

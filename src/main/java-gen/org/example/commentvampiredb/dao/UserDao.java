package org.example.commentvampiredb.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.example.commentvampiredb.CommentVampireDbModelPackage;
import org.example.commentvampiredb.User;

/**
 * The Dao implementation for the model object '<em><b>User</b></em>'.
 *
 * @generated
 */
public class UserDao extends BaseDao<User> {

  /**
   * @generated
   */
  @Override
  public Class<User> getEntityClass() {
    return User.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CommentVampireDbModelPackage.INSTANCE.getUserEClass();
  }
}

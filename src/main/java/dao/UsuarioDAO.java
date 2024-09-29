package dao;

import model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import javax.persistence.NoResultException;
import util.HibernateUtil;

public class UsuarioDAO {

    public void save(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void update(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void delete(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Usuario findByUserName(String username) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
        String jpql = "SELECT u FROM Usuario u WHERE u.userName = :username";
        return session.createQuery(jpql, Usuario.class)
                      .setParameter("username", username)
                      .getSingleResult(); 
    } catch (NoResultException e) {
        return null;  
    } finally {
        session.close();
    }
}

    public List<Usuario> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.createQuery("from Usuario", Usuario.class).list();
        } finally {
            session.close();
        }
    }
}

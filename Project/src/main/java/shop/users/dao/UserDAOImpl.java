package shop.users.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.users.models.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public List<User> getUserList() {
        EntityManager entityManager = getSession();
        Query theQuery = entityManager.createQuery("from User order by userName");
        List<User> usersList = theQuery.getResultList();
        return usersList;
    }

    @Override
    public void saveUser(User user) {
        EntityManager entityManager = getSession();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public User getUser(int userId) {
        Session entityManager = getSession();
        User theUser = entityManager.get(User.class, userId);
        return theUser;
    }

    @Override
    public void deleteUser(int userId) {
        EntityManager entityManager = getSession();
        Query theQuery = entityManager.createQuery("delete from User where Id=:userId");
        theQuery.setParameter("userId", userId);
        theQuery.executeUpdate();
    }
}

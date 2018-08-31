package shop.orders.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.orders.models.Order;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDao {

    @Autowired
    private EntityManager entityManager;

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public List<Order> getOrdersList() {
        Session entityManager = getSession();
        List<Order> ordersList = entityManager.createCriteria(Order.class).addOrder(org.hibernate.criterion.Order.asc("date")).list();
        return ordersList;
    }

    @Override
    public void saveOrder(Order order) {
        Session entityManager = getSession();
        entityManager.getTransaction().begin();
        entityManager.saveOrUpdate(order);
        entityManager.getTransaction().commit();
    }

    @Override
    public Order getOrder(int orderId) {
        Session entityManager = getSession();
        entityManager.getTransaction().begin();
        Order order = entityManager.get(Order.class, orderId);
        entityManager.getTransaction().commit();
        return order;
    }

    @Override
    public void deleteOrder(int orderId) {
        Session entityManager = getSession();
        entityManager.getTransaction().begin();
//        Criteria criteria = entityManager.createCriteria("delete from Order where orderId=:orderId").addOrder(org.hibernate.criterion.Order.asc("date"))
        Query theQuery = entityManager.createQuery("delete from Order where orderId=:orderId");
        theQuery.setParameter("orderId", orderId);
        theQuery.executeUpdate();
        entityManager.getTransaction().commit();
    }
}

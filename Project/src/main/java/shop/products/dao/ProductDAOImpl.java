package shop.products.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.products.models.Product;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public List<Product> getProductsList() {
        Session entityManager = getSession();
        List<Product> productsList = entityManager.createCriteria(Product.class).addOrder(Order.asc("productName")).list();
//      List<Product> productsList = entityManager.createQuery("FROM Product ORDER BY productName").getResultList();
        return productsList;
    }

    @Override
    public void saveProduct(Product product) {
        Session entityManager = getSession();
        entityManager.getTransaction().begin();
//        entityManager.persist(product);
        System.out.println(product);
        entityManager.saveOrUpdate(product);
        entityManager.getTransaction().commit();
    }

    @Override
    public Product getProduct(int productId) {
        Session entityManager = getSession();
        entityManager.getTransaction().begin();
        Product theProduct = entityManager.get(Product.class, productId);
        entityManager.getTransaction().commit();
        return theProduct;
    }

    @Override
    public void deleteProduct(int productId) {
        Session entityManager = getSession();
        entityManager.getTransaction().begin();
        Query theQuery = entityManager.createQuery("delete from Product where productId=:productId");
//        Criteria criteria = entityManager.createCriteria("delete from Product where productId=:productId");

        theQuery.setParameter("productId", productId);
        theQuery.executeUpdate();
        entityManager.getTransaction().commit();
    }

}

package shop.products.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.products.dao.ProductDAO;
import shop.products.models.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getProductsList() {
        return productDAO.getProductsList();
    }

    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }

    @Override
    public Product getProduct(int productId) {
        return productDAO.getProduct(productId);
    }

    @Override
    public void deleteProduct(int productId) {
        productDAO.deleteProduct(productId);
    }
}

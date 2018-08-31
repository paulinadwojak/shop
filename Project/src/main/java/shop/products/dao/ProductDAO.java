package shop.products.dao;

import shop.products.models.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> getProductsList();

    void saveProduct(Product product);

    Product getProduct(int productId);

    void deleteProduct(int productId);
}
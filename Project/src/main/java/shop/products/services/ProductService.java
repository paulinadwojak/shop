package shop.products.services;

import shop.products.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductsList();

    void saveProduct(Product product);

    Product getProduct(int productId);

    void deleteProduct(int productId);
}

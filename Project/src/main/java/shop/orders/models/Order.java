package shop.orders.models;


import lombok.Data;
import shop.orders.enums.OrderStatus;
import shop.products.models.Product;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", unique = true)
    private int orderId;

    @Column(name = "order_amount")
    private int orderAmount;

    @Column(name = "products_list")
    @ElementCollection
    private List<Product> productsList;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "order_status")
    private OrderStatus orderStatus;

    @Column(name = "user_id")
    private int userId;


}

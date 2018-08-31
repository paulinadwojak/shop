package shop.orders.dao;

import shop.orders.models.Order;

import java.util.List;

public interface OrderDao {

    List<Order> getOrdersList();

    void saveOrder(Order order);

    Order getOrder(int orderId);

    void deleteOrder(int orderId);
}

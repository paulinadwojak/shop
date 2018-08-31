package shop.orders.services;

import shop.orders.models.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrdersList();

    void saveOrder(Order order);

    Order getOrder(int orderId);

    void deleteOrder(int orderId);
}

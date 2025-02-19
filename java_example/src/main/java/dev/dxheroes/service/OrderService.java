package dev.dxheroes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import dev.dxheroes.dto.Order;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public void deleteOrder(Integer orderId) {
        boolean removed = orders.removeIf(order -> order.getId().equals(orderId));
        if (!removed) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Order not found with id: " + orderId
            );
        }
    }

    public Order createOrder(Order order) {
        order.setId(idGenerator.getAndIncrement());
        orders.add(order);
        return order;
    }
}
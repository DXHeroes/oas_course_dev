package dev.dxheroes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import dev.dxheroes.dto.Order;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }
}
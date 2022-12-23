package com.jojo.intersegrega.service;

import com.jojo.intersegrega.entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(Order order) {
        synchronized (ORDERS) {
            ORDERS.put(order.getId(), order);
        }
    }

    @Override
    public void delete(Order order) {
        synchronized (ORDERS) {
            ORDERS.remove(order.getId(), order);
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }

}

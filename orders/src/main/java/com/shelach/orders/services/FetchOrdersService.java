package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class is responsible of fetching the initial orders to be
 * presented to the user upon entering the orders page.
 * All quantities are initially set to 0
 */
@Service
@Slf4j
public class FetchOrdersService {
    public List<Order> getProducts(String customerName) {
        log.info("Fetching products for customer {}", customerName);
        return List.of(
                new Order("עגבניות", "TOMATOES", 0, 4.3),
                new Order("מלפפונים", "Cucumbers", 0, 2D)
        );
    }
}
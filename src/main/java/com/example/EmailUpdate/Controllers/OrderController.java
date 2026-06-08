package com.example.EmailUpdate.Controllers;


import com.example.EmailUpdate.Entities.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    private HashMap<Integer, Order> orders = new HashMap<>();

    public OrderController() {
        orders.put(101, new Order(101, "Muscat", "Pending"));
    }

    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(
            @PathVariable int orderId,
            @RequestParam String address,
            @RequestParam String status) {

        if (!orders.containsKey(orderId)) {
            return "Order not found";
        }

        Order order = orders.get(orderId);

        order.setShippingAddress(address);
        order.setOrderStatus(status);

        return "Order Updated Successfully\n"
                + "Order ID: " + order.getOrderId() + "\n"
                + "Updated Shipping Address: "
                + order.getShippingAddress() + "\n"
                + "Updated Order Status: "
                + order.getOrderStatus();
    }
}


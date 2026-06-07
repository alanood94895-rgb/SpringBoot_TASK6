package com.example.EmailUpdate;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    // In-memory storage
    private HashMap<Integer, Order> orders = new HashMap<>();

    // Preload sample order
    public OrderController() {
        orders.put(101,
                new Order(
                        101,
                        "Muscat",
                        "Pending"
                ));
    }

    @PutMapping("/update-order/{orderId}")
    public String updateOrder(
            @PathVariable int orderId,
            @RequestParam String address,
            @RequestParam String status) {

        // Check if order exists
        if (!orders.containsKey(orderId)) {
            return "Order not found";
        }

        // Retrieve order
        Order order = orders.get(orderId);

        // Update multiple fields
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


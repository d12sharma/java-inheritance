// Base class: Order
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped, Tracking Number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

// Testing the classes
public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-03-17");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-03-16", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-03-15", "TRK67890", "2025-03-18");

        Order[] orders = {order, shippedOrder, deliveredOrder};
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId + " - Status: " + o.getOrderStatus());
        }
    }
}

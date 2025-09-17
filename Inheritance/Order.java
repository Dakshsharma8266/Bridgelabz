// Base class
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String date) {
        this.orderId = orderId;
        this.orderDate = date;
    }
}

// Subclass
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String date, String tracking) {
        super(orderId, date);
        this.trackingNumber = tracking;
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String date, String tracking, String deliveryDate) {
        super(orderId, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Tracking: " + trackingNumber + ", Delivered on: " + deliveryDate);
    }
}

// Demo
public class OrderDemo {
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder("ORD001", "2025-09-17", "TRK123", "2025-09-20");
        d1.getOrderStatus();
    }
}

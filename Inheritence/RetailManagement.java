class Order {
    String orderId;
    String orderDate;
    Order(String orderId, String orderDate) {
    this.orderId = orderId;
    this.orderDate = orderDate;
    }
    String getOrderStatus() {
    return "Order Placed";
    }
    }
    
    class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
    super(orderId, orderDate);
    this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
    return "Order Shipped";
    }
    }
    
    class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
    super(orderId, orderDate, trackingNumber);
    this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
    return "Order Delivered";
    }
    }
    
    public class RetailManagement {
    public static void main(String[] args) {
    Order o = new Order("ORD1001", "2025-07-30");
    ShippedOrder s = new ShippedOrder("ORD1002", "2025-07-28", "TRK456");
    DeliveredOrder d = new DeliveredOrder("ORD1003", "2025-07-25", "TRK789", "2025-07-29");
    System.out.println(o.orderId + ": " + o.getOrderStatus());
    System.out.println(s.orderId + ": " + s.getOrderStatus());
    System.out.println(d.orderId + ": " + d.getOrderStatus());
    }
    }
    
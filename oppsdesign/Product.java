import java.util.ArrayList;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - $" + price);
    }
}

// Order class
class Order {
    String orderId;
    ArrayList<Product> products; // Aggregation

    Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.display();
        }
    }
}

// Customer class
class Customer {
    String name;
    ArrayList<Order> orders; // Association

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
    }

    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

// Demo
public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Mouse", 20);
        Product p3 = new Product("Keyboard", 50);

        Order order1 = new Order("ORD001");
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order("ORD002");
        order2.addProduct(p3);

        Customer customer = new Customer("Alice");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.showOrders();
    }
}

import java.util.*;

class Product {
    private String name;
    private double price;
    public Product(String name,double price){ this.name=name; this.price=price; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
}

class Order {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product p){ products.add(p); }
    public void showOrder(){
        double total=0;
        System.out.println("Order:");
        for(Product p: products){ 
            System.out.println(p.getName()+" : "+p.getPrice());
            total+=p.getPrice();
        }
        System.out.println("Total: "+total);
    }
}

class Customer {
    private String name;
    public Customer(String name){ this.name = name; }
    public void placeOrder(Order o){ 
        System.out.println(name+" placed order");
        o.showOrder();
    }
}

public class ECommerceSystem {
    public static void main(String[] args){
        Customer c = new Customer("Neha");
        Product p1 = new Product("Laptop",50000);
        Product p2 = new Product("Shoes",2000);
        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);
        c.placeOrder(o);
    }
}

import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;
    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getProductId(){ return productId; }
    public void setProductId(String id){ this.productId = id; }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public double getPrice(){ return price; }
    public void setPrice(double p){ this.price = p; }
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyYears;
    public Electronics(String id, String name, double price, double warrantyYears){
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }
    public double calculateDiscount(){ return getPrice() * 0.10; }
    public double calculateTax(){ return getPrice() * 0.18; }
    public String getTaxDetails(){ return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    private String size;
    public Clothing(String id, String name, double price, String size){
        super(id, name, price);
        this.size = size;
    }
    public double calculateDiscount(){ return getPrice() * 0.20; }
    public double calculateTax(){ return getPrice() * 0.05; }
    public String getTaxDetails(){ return "GST 5%"; }
}

class Groceries extends Product {
    private String expiry;
    public Groceries(String id, String name, double price, String expiry){
        super(id, name, price);
        this.expiry = expiry;
    }
    public double calculateDiscount(){ return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void printFinalPrices(List<Product> products){
        for(Product p : products){
            double tax = 0;
            String taxInfo = "No tax";
            if(p instanceof Taxable){
                Taxable t = (Taxable)p;
                tax = t.calculateTax();
                taxInfo = t.getTaxDetails();
            }
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " | Price: " + p.getPrice() + " | Tax: " + tax + " (" + taxInfo + ") | Discount: " + discount + " | Final: " + finalPrice);
        }
    }
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001","Smartphone",20000,2));
        products.add(new Clothing("C001","T-Shirt",800,"M"));
        products.add(new Groceries("G001","Milk",60,"2025-12-01"));
        printFinalPrices(products);
    }
}

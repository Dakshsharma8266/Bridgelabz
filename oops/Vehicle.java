import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber(){ return vehicleNumber; }
    public void setVehicleNumber(String v){ this.vehicleNumber = v; }
    public String getType(){ return type; }
    public void setType(String t){ this.type = t; }
    public double getRentalRate(){ return rentalRate; }
    public void setRentalRate(double r){ this.rentalRate = r; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;
    public Car(String num, double rate, String policyNumber){
        super(num,"Car",rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days){ return getRentalRate() * days; }
    public double calculateInsurance(){ return 500.0; }
    public String getInsuranceDetails(){ return "Car policy: " + policyNumber; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    public Bike(String num, double rate, String policyNumber){
        super(num,"Bike",rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days){ return getRentalRate() * days * 0.6; }
    public double calculateInsurance(){ return 150.0; }
    public String getInsuranceDetails(){ return "Bike policy: " + policyNumber; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;
    public Truck(String num, double rate, String policyNumber){
        super(num,"Truck",rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days){ return getRentalRate() * days * 1.5; }
    public double calculateInsurance(){ return 1000.0; }
    public String getInsuranceDetails(){ return "Truck policy: " + policyNumber; }
}

public class VehicleRentalSystem {
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("KA01AB1234",2000,"CP123"));
        vehicles.add(new Bike("KA02XY9876",500,"BP456"));
        vehicles.add(new Truck("KA03TR5555",5000,"TP789"));
        for(Vehicle v : vehicles){
            double rental = v.calculateRentalCost(3);
            double insurance = (v instanceof Insurable) ? ((Insurable)v).calculateInsurance() : 0;
            String insDetails = (v instanceof Insurable) ? ((Insurable)v).getInsuranceDetails() : "No insurance";
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " | Rental(3 days): " + rental + " | Insurance: " + insurance + " | " + insDetails);
        }
    }
}

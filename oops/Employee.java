import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
    public Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmployeeId(){ return employeeId; }
    public void setEmployeeId(String id){ this.employeeId = id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public double getBaseSalary(){ return baseSalary; }
    public void setBaseSalary(double s){ this.baseSalary = s; }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double fixedSalary;
    public FullTimeEmployee(String id, String name, double baseSalary, double fixedSalary){
        super(id, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    public double getFixedSalary(){ return fixedSalary; }
    public void setFixedSalary(double s){ this.fixedSalary = s; }
    public double calculateSalary(){
        return getBaseSalary() + fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;
    public PartTimeEmployee(String id, String name, double baseSalary, int workHours, double hourlyRate){
        super(id, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
    public int getWorkHours(){ return workHours; }
    public void setWorkHours(int h){ this.workHours = h; }
    public double getHourlyRate(){ return hourlyRate; }
    public void setHourlyRate(double r){ this.hourlyRate = r; }
    public double calculateSalary(){
        return getBaseSalary() + workHours * hourlyRate;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class DepartmentImpl implements Department {
    private String dept;
    public void assignDepartment(String dept){ this.dept = dept; }
    public String getDepartmentDetails(){ return dept; }
}

public class EmployeeManagement {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f = new FullTimeEmployee("F001","Alice",5000,2000);
        PartTimeEmployee p = new PartTimeEmployee("P001","Bob",1000,80,15);
        employees.add(f);
        employees.add(p);
        DepartmentImpl d = new DepartmentImpl();
        d.assignDepartment("HR");
        for(Employee e : employees){
            e.displayDetails();
        }
        System.out.println("Department: " + d.getDepartmentDetails());
    }
}

import java.util.*;

class Employee {
    private String name;
    public Employee(String name){ this.name = name; }
    public String getName(){ return name; }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    public Department(String name){ this.name = name; }
    public void addEmployee(Employee e){ employees.add(e); }
    public void showEmployees(){
        System.out.println("Department: " + name);
        for(Employee e: employees){ System.out.println(e.getName()); }
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();
    public Company(String name){ this.name = name; }
    public void addDepartment(Department d){ departments.add(d); }
    public void showDepartments(){
        System.out.println("Company: " + name);
        for(Department d: departments){ d.showEmployees(); }
    }
}

public class CompanyComposition {
    public static void main(String[] args){
        Company c = new Company("TechCorp");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        d1.addEmployee(new Employee("Amit"));
        d1.addEmployee(new Employee("Rita"));
        d2.addEmployee(new Employee("Suresh"));
        c.addDepartment(d1);
        c.addDepartment(d2);
        c.showDepartments();
    }
}

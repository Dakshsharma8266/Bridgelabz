import java.util.ArrayList;

// Employee class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

// Department class
class Department {
    String name;
    ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }
}

// Company class
class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

// Demo
public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dep1 = new Department("IT");
        Department dep2 = new Department("HR");

        dep1.addEmployee(new Employee("Alice"));
        dep1.addEmployee(new Employee("Bob"));
        dep2.addEmployee(new Employee("Charlie"));

        company.addDepartment(dep1);
        company.addDepartment(dep2);

        company.showCompanyDetails();
    }
}
Company
---------------
- name: String
- departments: ArrayList<Department>
---------------
+ addDepartment(Department)
+ showCompanyDetails()

Department
---------------
- name: String
- employees: ArrayList<Employee>
---------------
+ addEmployee(Employee)
+ showEmployees()

Employee
---------------
- name: String
---------------
+ display()

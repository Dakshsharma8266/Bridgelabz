import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name){ this.name = name; }
    public String getName(){ return name; }
}

class Department {
    private String name;
    public Department(String name){ this.name = name; }
    public String getName(){ return name; }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    public University(String name){ this.name = name; }
    public void addDepartment(Department d){ departments.add(d); }
    public void addFaculty(Faculty f){ faculties.add(f); }
    public void showStructure(){
        System.out.println("University: " + name);
        for(Department d: departments){ System.out.println("Dept: " + d.getName()); }
        for(Faculty f: faculties){ System.out.println("Faculty: " + f.getName()); }
    }
}

public class UniversitySystem {
    public static void main(String[] args){
        University u = new University("ABC University");
        Department d1 = new Department("CS");
        Department d2 = new Department("Physics");
        Faculty f1 = new Faculty("Dr. Mehta");
        Faculty f2 = new Faculty("Dr. Rao");
        u.addDepartment(d1);
        u.addDepartment(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);
        u.showStructure();
    }
}

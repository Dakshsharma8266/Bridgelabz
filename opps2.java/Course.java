import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Course(String name){ this.name = name; }
    public void enroll(Student s){ students.add(s); }
    public void showStudents(){
        System.out.println("Course: " + name);
        for(Student s: students){ System.out.println(s.getName()); }
    }
    public String getName(){ return name; }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(String name){ this.name = name; }
    public void enrollCourse(Course c){ courses.add(c); c.enroll(this); }
    public void showCourses(){
        System.out.println(name + " enrolled in:");
        for(Course c: courses){ System.out.println(c.getName()); }
    }
    public String getName(){ return name; }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    public School(String name){ this.name = name; }
    public void addStudent(Student s){ students.add(s); }
    public void showStudents(){
        System.out.println("School: " + name);
        for(Student s: students){ System.out.println(s.getName()); }
    }
}

public class SchoolSystem {
    public static void main(String[] args){
        School sch = new School("DPS");
        Student s1 = new Student("Ankit");
        Student s2 = new Student("Priya");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        sch.addStudent(s1); sch.addStudent(s2);
        s1.enrollCourse(c1); s1.enrollCourse(c2);
        s2.enrollCourse(c1);
        sch.showStudents();
        s1.showCourses();
        c1.showStudents();
    }
}

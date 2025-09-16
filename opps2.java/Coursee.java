import java.util.*;

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();
    public Course(String name){ this.name = name; }
    public void assignProfessor(Professor p){ this.professor = p; }
    public void enroll(Student s){ students.add(s); }
    public void show(){
        System.out.println("Course: "+name);
        if(professor!=null) System.out.println("Professor: "+professor.getName());
        for(Student s: students){ System.out.println("Student: "+s.getName()); }
    }
    public String getName(){ return name; }
}

class Student {
    private String name;
    public Student(String name){ this.name = name; }
    public void enrollCourse(Course c){ c.enroll(this); }
    public String getName(){ return name; }
}

class Professor {
    private String name;
    public Professor(String name){ this.name = name; }
    public void assignCourse(Course c){ c.assignProfessor(this); }
    public String getName(){ return name; }
}

public class UniversityManagement {
    public static void main(String[] args){
        Student s1 = new Student("Raj");
        Student s2 = new Student("Maya");
        Professor p1 = new Professor("Dr. Singh");
        Course c1 = new Course("AI");
        p1.assignCourse(c1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        c1.show();
    }
}

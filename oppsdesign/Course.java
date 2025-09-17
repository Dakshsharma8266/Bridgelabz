import java.util.ArrayList;

// Course class
class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        this.professor = p;
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if(professor != null)
            System.out.println("Professor: " + professor.name);
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class
class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }
}

// Professor class
class Professor {
    String name;
    ArrayList<Course> courses;

    Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(Course c) {
        courses.add(c);
        c.assignProfessor(this);
    }
}

// Demo
public class UniversityDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Database Systems");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignCourse(c1);
        p1.assignCourse(c2);

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
Student
---------------
- name: String
- courses: ArrayList<Course>
---------------
+ enrollCourse(Course)

Professor
---------------
- name: String
- courses: ArrayList<Course>
---------------
+ assignCourse(Course)

Course
---------------
- courseName: String
- professor: Professor
- enrolledStudents: ArrayList<Student>
---------------
+ assignProfessor(Professor)
+ enrollStudent(Student)
+ showCourseDetails()

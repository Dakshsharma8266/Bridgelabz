class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = recorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }

    void showDetails() {
        System.out.println(courseName + " on " + platform + ", Fee: " + fee + ", Discount: " + discount);
    }
}

// Demo
public class CourseDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 100, 20);
        poc.showDetails();
    }
}

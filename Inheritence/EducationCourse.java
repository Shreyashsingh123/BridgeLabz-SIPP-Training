class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
    this.courseName = courseName;
    this.duration = duration;
    }
    void displayInfo() {
    System.out.println("Course Name: " + courseName);
    System.out.println("Duration: " + duration + " weeks");
    }
    }
    
    class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
    super(courseName, duration);
    this.platform = platform;
    this.isRecorded = isRecorded;
    }
    void displayInfo() {
    super.displayInfo();
    System.out.println("Platform: " + platform);
    System.out.println("Recorded: " + isRecorded);
    }
    }
    
    class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
    super(courseName, duration, platform, isRecorded);
    this.fee = fee;
    this.discount = discount;
    }
    void displayInfo() {
    super.displayInfo();
    System.out.println("Fee: ₹" + fee);
    System.out.println("Discount: " + discount + "%");
    }
    }
    
    public class EducationCourse {
    public static void main(String[] args) {
    PaidOnlineCourse p = new PaidOnlineCourse("Data Structures", 6, "Coursera", true, 5000, 10);
    p.displayInfo();
    }
    }
    
class Course{
    String courseName;
    int duration;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: Rs." + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: Rs." + getDiscountedPrice());
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Java", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Python for Data Science", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Machine Learning", 12, "Coursera", true, 299.99, 20);

        course.displayCourseDetails();
        System.out.println();
        onlineCourse.displayCourseDetails();
        System.out.println();
        paidCourse.displayCourseDetails();
    }
}
package ManagerTeacherandStudent;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    private String major;
    private Map<String, String> majorCourses;

    @Override
    public String toString() {
        return "Teacher information: " +
                " email: " + email +
                ", name: " + name +
                ", age: " + age +
                ", gender: " + gender +
                ", phonenumber: " + phoneNumber +
                ", address: " + address +
                ", major: " + major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String email, String name, int age, String gender, String phoneNumber, String address, String major) {
        super(email, name, age, gender, phoneNumber, address);
        this.major = major;
        this.majorCourses = new HashMap<String, String>();
    }

    public void addMajorCourses(String major, String courses) {
        this.majorCourses.put(major, courses);
    }

    public void displayMajor() {
        System.out.println("Major: " + major);
    }

    public void displayMajorCouurses() {
        System.out.println("Courses for major " + major + ": " + majorCourses.get(major));
    }
}


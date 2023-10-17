package Project_Manager_Teacher_and_Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private String major;
    private Map<String, List<String>> majorCourses;

    @Override
    public String toString() {
        return "Teacher information: " +
                " email: " + getEmail() +
                ", name: " + getName() +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                ", phonenumber: " + getPhoneNumber() +
                ", address: " + getAddress() +
                ", major: " + major +
                ", course: " + getMajorCourses();


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
        this.majorCourses = new HashMap<String, List<String>>();
    }

    public void addMajorCourses(String major, String course) {
        if (this.majorCourses.containsKey(major))
            this.majorCourses.get(major).add(course);
        else {
            List<String> courses = new ArrayList<>();
            courses.add(course);
            this.majorCourses.put(major, courses);
        }
    }

    public Map<String, List<String>> getMajorCourses() {
        return majorCourses;
    }

    public void setMajorCourses(Map<String, List<String>> majorCourses) {
        this.majorCourses = majorCourses;
    }

    public void displayMajor() {
        System.out.println("Major: " + major);
    }

    public void displayMajorCouurses() {
        System.out.println("Courses for major " + major + ": " + majorCourses.get(major));
    }
}


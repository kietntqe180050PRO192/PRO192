package Project_Manager_Teacher_and_Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person implements Serializable {
    private List<String> courses;

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Teacher() {
    }

    public Teacher(String email, String name, int age, String gender, String phoneNumber, String address) {
        super(email, name, age, gender, phoneNumber, address);
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Courses: " + courses);
    }

    @Override
    public String toString() {
        return "Teacher information: " +
                " email: " + getEmail() +
                ", name: " + getName() +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                ", phonenumber: " + getPhoneNumber() +
                ", address: " + getAddress() +
                ", teach subject: " + getCourses();
    }
}




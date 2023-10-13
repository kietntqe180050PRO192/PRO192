package Project_Manager_Teacher_and_Student;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<String> courses;

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
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
                " email: " + email +
                ", name: " + name +
                ", age: " + age +
                ", gender: " + gender +
                ", phonenumber: " + phoneNumber +
                ", address: " + address;
    }


    }




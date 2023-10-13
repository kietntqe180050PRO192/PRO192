package Project_Manager_Teacher_and_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class School {
    private List<Teacher> listTeacher = new ArrayList<>();
    private List<Student> listStudent = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        this.listTeacher.add(teacher);
    }

    public void addStudent(Student student) {
        this.listStudent.add(student);
    }

    public Teacher findTeacher(String email, String course) {
        for (Teacher teacher : listTeacher) {
            if (teacher.email.equals(email) && teacher.getCourses().contains(course))
                return teacher;
        }
        return null;
    }

    public Student findStudent(String email, String major) {
        for (Student student : listStudent) {
            if (student.email.equals(email) && student.getMajor().equals(major))
                return student;
        }
        return null;
    }

    public void dislpayStudent() {
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }

    public void dislpayTeacher() {
        for (Teacher teacher : listTeacher) {
            System.out.println(teacher.toString());
        }
    }

    public void editTeacher(String email, String course, String newEmail, String newName, int newAge, String newGender,
                            String newPhoneNumber, String newAdress, List<String> newCourse) {
        Teacher teacher = findTeacher(email, course);
        if (teacher != null) {
            teacher.setEmail(newEmail);
            teacher.setName(newName);
            teacher.setAge(newAge);
            teacher.setGender(newGender);
            teacher.setPhoneNumber(newPhoneNumber);
            teacher.setAddress(newAdress);
            teacher.setCourses(newCourse);
        }
    }

    public void editStudent(String email, String major, String newEmail, String newName, int newAge, String newGender,
                            String newPhoneNumber, String newAdress, String newMajor, Map<String, List<String>> newMajorCourse)  {
        Student student = findStudent(email, major);
        if (student != null) {
            student.setEmail(newEmail);
            student.setName(newName);
            student.setAge(newAge);
            student.setGender(newGender);
            student.setPhoneNumber(newPhoneNumber);
            student.setAddress(newAdress);
            student.setMajor(newMajor);
            student.setMajorCourses(newMajorCourse);
        }
    }
}



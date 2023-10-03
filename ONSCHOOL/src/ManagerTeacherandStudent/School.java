package ManagerTeacherandStudent;

import java.util.ArrayList;
import java.util.List;

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
}


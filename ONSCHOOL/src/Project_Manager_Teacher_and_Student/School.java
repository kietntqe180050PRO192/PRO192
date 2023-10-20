package Project_Manager_Teacher_and_Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.FileOutputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

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
            if (teacher.getEmail().equals(email) && teacher.getCourses().contains(course))                              // lấy email check xem equal với equal mới nhập không và check khóa học xem có trong list khóa học ko
                return teacher;
        }
        return null;
    }

    public Student findStudent(String email, String major) {
        for (Student student : listStudent) {
            if (student.getEmail().equals(email) && student.getMajor().equals(major))
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
                            String newPhoneNumber, String newAdress, List<String> newCourse, String choose1) {
        Teacher teacher = findTeacher(email, course);                                                                   // tạo biến teacher, dựa vào method findTeacher bên trên để tìm gv cần edit
        if (teacher != null) {
            List<String> currentCourses = teacher.getCourses();                                                         // lấy danh sách khóa học hiên tại
            switch (choose1) {
                case "c":
                    currentCourses.addAll(newCourse);                                                                   // add all course ng dùng nhập vào list course hiện tại
                    break;
                case "d":
                    currentCourses.removeAll(currentCourses);
                    currentCourses.addAll(newCourse);                                                                   // xóa course hiện tại và add all course mới vào
                    break;
            }
            // sửa các thông tin
            teacher.setEmail(newEmail);
            teacher.setName(newName);
            teacher.setAge(newAge);
            teacher.setGender(newGender);
            teacher.setPhoneNumber(newPhoneNumber);
            teacher.setAddress(newAdress);
            teacher.setCourses(newCourse);
            teacher.setCourses(currentCourses);                                                                         // đặt list course đã cập nhập

            System.out.println("Successfully updated teacher information!");
        }
    }

    public void editStudent(String email, String major, String newEmail, String newName, int newAge, String newGender,
                            String newPhoneNumber, String newAdress, String newMajor, Map<String, List<String>> newMajorCourse, String choose2) {
        Student student = findStudent(email, major);
        if (student != null) {
            Map<String, List<String>> currentMajorCourse = student.getMajorCourses();                                   // lấy các course của hs
            switch (choose2) {
                case "c":                                                                                               // major cũ và thêm các course mới vào với các course cũ
                    for (Map.Entry<String, List<String>> entry : newMajorCourse.entrySet()) {                           // Use Map.Entry duyệt và lấy từng key và value
                        String key = entry.getKey();
                        List<String> newValue = entry.getValue();                                                       // lấy key và value trong ds entry
                        if (currentMajorCourse.containsKey(key))
                            currentMajorCourse.get(key).addAll(newValue);
                        else
                            currentMajorCourse.put(key, newValue);
                    }
                    break;

                case "d":                                                                                               // major cũ và xóa các course cũ và thêm các course mới
                    for (Map.Entry<String, List<String>> entry : newMajorCourse.entrySet()) {                           // Use Map.Entry duyệt và lấy từng key và value
                        String key = entry.getKey();
                        List<String> newValue = entry.getValue();
                        currentMajorCourse.put(key, newValue);
                    }
                    break;

                case "e":
                    student.setMajor(newMajor);
                    student.setMajorCourses(newMajorCourse);
                    break;
            }

            student.setEmail(newEmail);
            student.setName(newName);
            student.setAge(newAge);
            student.setGender(newGender);
            student.setPhoneNumber(newPhoneNumber);
            student.setAddress(newAdress);
        }
    }

    public void dowloadDataTeacherFile(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file, true);                                                          // ghi dữ liệu vào file
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            PrintWriter writer = new PrintWriter(osw);
            for (Teacher teacher : listTeacher) {
                writer.println(teacher.toString());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: "+ e.getMessage());
        }
    }

    public void dowloadDataStudentFile(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            PrintWriter writer = new PrintWriter(osw);
            for (Student student : listStudent) {
                writer.println(student.toString());
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: "+ e.getMessage());
        }
    }

/*
    public void loadDataTeacherFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Teacher> listTeacher = new ArrayList<>();
            while (true) {
                try {
                    Teacher teacher = (Teacher) ois.readObject();
                    listTeacher.add(teacher);
                } catch (EOFException e) {
                    break;
                }
            }
            // Now listTeacher contains all the Teacher objects from the file.
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }

    public void loadDataStudentFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Student> listStudent = new ArrayList<>();
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    listStudent.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
            // Now listTeacher contains all the Teacher objects from the file.
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
*/

}

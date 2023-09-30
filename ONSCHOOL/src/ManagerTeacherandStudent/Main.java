package ManagerTeacherandStudent;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: To enter teacher information.");
        System.out.println("Enter 2: To enter student information.");
        System.out.println("Enter 3: To exit the program.");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                // Thông tin giáo viên
                System.out.println("Enter teacher's email: ");
                String teacherEmail = sc.nextLine();
                System.out.println("Enter teacher's name: ");
                String teacherName = sc.nextLine();
                System.out.println("Enter teacher's age: ");
                int teacherAge = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter teacher's gender: ");
                String teacherGender = sc.nextLine();
                System.out.println("Enter teacher's phonenumber: ");
                String teacherPhoneNumber = sc.nextLine();
                System.out.println("Enter teacher's address: ");
                String teacherAddress = sc.nextLine();
                Teacher teacher = new Teacher(teacherEmail, teacherName, teacherAge, teacherGender, teacherPhoneNumber, teacherGender);
                //In ra thông tin giáo viên
                System.out.println(teacher.toString());
                //Thêm khóa dạy của giáo viên
                System.out.println("Enter courses to be taught by " + teacher.getName() + " (or enter 'exit' to finnish");
                String course = sc.nextLine();
                while (!course.equalsIgnoreCase("exit")) {
                    teacher.addCourse(course);
                    System.out.println("Enter next course name (or enter 'exit' to finnish): ");
                    course = sc.nextLine();
                }
                teacher.displayCourses();
                break;
            case "2":
                //Thông tin sinh viên
                System.out.println("Enter stuent's email: ");
                String studentEmail = sc.nextLine();
                System.out.println("Enter student's name: ");
                String studentName = sc.nextLine();
                System.out.println("Enter student's age: ");
                int studentAge = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter student's gender: ");
                String studentGender = sc.nextLine();
                System.out.println("Enter student's phonenumber: ");
                String studentPhoneNumber = sc.nextLine();
                System.out.println("Enter student's address: ");
                String studentAddress = sc.nextLine();
                System.out.println("Enter student's major: ");
                String studentMajor = sc.nextLine();
                sc.nextLine();
                Student student = new Student(studentEmail, studentName, studentAge, studentGender, studentPhoneNumber, studentAddress, studentMajor);
                //In thông tin sinh viên
                System.out.println(student.toString());
                //
                System.out.println("Enter courses to be taught by " + student.getName() + " (or enter 'exit' to finnish)" );
                String courseStudent = sc.nextLine();

                while (!courseStudent.equalsIgnoreCase("exit")) {
                    student.addMajorCourses(studentMajor, courseStudent);
                    System.out.println("Enter next course name (or 'exit' to finish): ");
                    courseStudent = sc.nextLine();
                }

                student.displayMajorCouurses();
                break;
        }
        sc.close();
    }
}

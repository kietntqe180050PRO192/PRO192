package ManagerTeacherandStudent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.SplittableRandom;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();

        while (true) {
            System.out.println("Enter 1: To enter teacher information.");
            System.out.println("Enter 2: To enter student information.");
            System.out.println("Enter 3: To find a teacher.");
            System.out.println("Enter 4: To find a student.");
            System.out.println("Enter 5: To exit the program.");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
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
                    Teacher teacher = new Teacher(teacherEmail, teacherName, teacherAge, teacherGender, teacherPhoneNumber, teacherAddress);
                    school.addTeacher(teacher);

                    System.out.println(teacher.toString());

                    System.out.println("Enter courses to be taught by " + teacher.getName() + " (or enter 'exit' to finnish)");
                    String course = sc.nextLine();
                    while (!course.equalsIgnoreCase("exit")) {
                        teacher.addCourse(course);
                        System.out.println("Enter next course name (or enter 'exit' to finnish): ");
                        course = sc.nextLine();
                    }
                    teacher.displayCourses();
                    break;
                case "2":
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
                    Student student = new Student(studentEmail, studentName, studentAge, studentGender, studentPhoneNumber, studentAddress, studentMajor);

                    school.addStudent(student);

                    System.out.println(student.toString());

                    System.out.println("Enter the course are studying " + student.getName() + " (or enter 'exit' to finnish)");
                    String courseStudent = sc.nextLine();
                    while (!courseStudent.equalsIgnoreCase("exit")) {
                        student.addMajorCourses(studentMajor, courseStudent);
                        System.out.println("Enter next course name (or 'exit' to finish): ");
                        courseStudent = sc.nextLine();
                    }
                    student.displayMajorCouurses();
                    break;
                case "3":
                    System.out.println("Enter teacher's email: ");
                    String emailTeacher = sc.nextLine();
                    System.out.println("Enter teacher's name of course: ");
                    String courseTeacher = sc.nextLine();
                    Teacher foundTeacher = school.findTeacher(emailTeacher, courseTeacher);
                    if (foundTeacher != null)
                        System.out.println("Found teacher: " + foundTeacher);
                    else
                        System.out.println("No teacher found with the given email and course.");
                        break;

                case "4":
                    System.out.println("Enter student's email: ");
                    String emailStudent = sc.nextLine();
                    System.out.println("Enter student's major: ");
                    String majorStudent = sc.nextLine();
                    Student foundStudent = school.findStudent(emailStudent, majorStudent);
                    if (foundStudent != null)
                        System.out.println("Found teacher: " + foundStudent);
                    else
                        System.out.println("No student found with the given email and major.");
                        break;

                case "5":
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }}}}


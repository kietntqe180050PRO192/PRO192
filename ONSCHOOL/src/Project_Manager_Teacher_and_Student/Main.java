package Project_Manager_Teacher_and_Student;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("| MENU!                                                                             |");
            System.out.println("| Enter 1: Enter information (Teacher or Student).                                  |");
            System.out.println("| Enter 2: Displays all information (Teacher or Student) currently on the list.     |");
            System.out.println("| Enter 3: To find a (Teacher or Student).                                          |");
            System.out.println("| Enter 4: Edit information (Teacher or Student).                                   |");
            System.out.println("| Enter 5: Download information to file of teacher or student.                      |");
            System.out.println("| Enter 0: To exit the program.                                                     |");
            System.out.println("-------------------------------------------------------------------------------------");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Choose an option: ");
                    System.out.println("Enter a: To enter information of teacher. ");
                    System.out.println("Enter b: To enter information of student. ");
                    String option = sc.nextLine();
                    switch (option) {
                        case "a":
                            System.out.println("Enter teacher's email: ");
                            String teacherEmail = sc.nextLine();
                            System.out.println("Enter teacher's name: ");
                            String teacherName = sc.nextLine();
                            System.out.println("Enter teacher's age: ");
                            int teacherAge = sc.nextInt();
                            sc.nextLine();                                                                              // trả về dòng tt trong chuỗi, di chuyển đến dòng kế tiếp
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
                            String courseTeacher = sc.nextLine();
                            while (!courseTeacher.equalsIgnoreCase("exit")) {                                // vòng lặp while này sẽ thực hiện khi biến courseTeacher ng dùng nhập khác "exit" và đó là khóa học
                                teacher.addCourse(courseTeacher);
                                System.out.println("Enter next course name (or enter 'exit' to finnish): ");
                                courseTeacher = sc.nextLine();
                            }
                            teacher.displayCourses();
                            break;

                        case "b":
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
                            while (!courseStudent.equalsIgnoreCase("exit")) {                                // vòng lặp while này sẽ thực hiện khi biến courseStudent ng dùng nhập khác "exit" và đó là khóa học
                                student.addMajorCourses(studentMajor, courseStudent);
                                System.out.println("Enter next course name (or 'exit' to finish): ");
                                courseStudent = sc.nextLine();
                            }
                            student.displayMajorCouurses();
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;
                case "2":
                    System.out.println("Choose an option: ");
                    System.out.println("Enter a: Displays all information teacher currently on the list.");
                    System.out.println("Enter b: Displays all information student currently on the list.");
                    String option2 = sc.nextLine();
                    switch (option2) {
                        case "a":
                            school.dislpayTeacher();
                            break;

                        case "b":
                            school.dislpayStudent();
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;

                case "3":
                    System.out.println("Choose an option: ");
                    System.out.println("Enter a: To find a teacher by email and course. ");
                    System.out.println("Enter b: To find a student by email and major. ");
                    String option3 = sc.nextLine();
                    switch (option3) {
                        case "a":
                            System.out.println("Enter teacher's email: ");
                            String emailTeacher = sc.nextLine();
                            System.out.println("Enter teacher's name of course: ");
                            String courseTeacher = sc.nextLine();
                            Teacher foundTeacher = school.findTeacher(emailTeacher, courseTeacher);                     // Kq của method findTeacher dc gán cho biến foundTeacher
                            if (foundTeacher != null)
                                System.out.println("Found teacher: " + foundTeacher);
                            else
                                System.out.println("No teacher found with the given email and course.");
                            break;

                        case "b":
                            System.out.println("Enter student's email: ");
                            String emailStudent = sc.nextLine();
                            System.out.println("Enter student's major: ");
                            String majorStudent = sc.nextLine();
                            Student foundStudent = school.findStudent(emailStudent, majorStudent);                      // Kq của method findStutdent dc gán cho biến foundStudent
                            if (foundStudent != null)
                                System.out.println("Found teacher: " + foundStudent);
                            else
                                System.out.println("No student found with the given email and major.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;

                case "4":
                    System.out.println("Note: you change the information you want and enter the original information of the information you don't want!");
                    System.out.println("Choose an option: ");
                    System.out.println("Enter a: Edit information teacher.");
                    System.out.println("Enter b: Edit information student.");
                    String option4 = sc.nextLine();
                    switch (option4) {
                        case "a":
                            System.out.println("Enter teacher's email:");
                            String emailTeacher = sc.nextLine();
                            System.out.println("Enter a teacher's course:");
                            String cousreTeacher = sc.nextLine();
                            Teacher teacher = school.findTeacher(emailTeacher, cousreTeacher);
                            if (teacher == null) {
                                System.out.println("No teacher found with the given email and course.");
                            } else {
                                school.dislpayTeacher();
                                System.out.println("Enter teacher's new email:");
                                String newEmailTeacher = sc.nextLine();
                                System.out.println("Enter teacher's new name:");
                                String newNameTeacher = sc.nextLine();
                                System.out.println("Enter teacher's new age:");
                                int newAgeTeacher = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter teacher's new gender:");
                                String newGenderTeacher = sc.nextLine();
                                System.out.println("Enter teacher's new phone number:");
                                String newPhoneNumberTeacher = sc.nextLine();
                                System.out.println("Enter teacher's new adrress:");
                                String newAdrressTeacher = sc.nextLine();
                                System.out.println("Enter c: Add another course. ");
                                System.out.println("Enter d: Change old course to new course. ");
                                String choose1 = sc.nextLine();

                                List<String> newCousresTeacher = new ArrayList<>();
                                while (true) {
                                    System.out.println("Enter a new course (or 'done' to finish)");
                                    String newCourseTeacher = sc.nextLine();
                                    if (newCourseTeacher.equalsIgnoreCase("done"))
                                        break;
                                    newCousresTeacher.add(newCourseTeacher);
                                }
                                ;
                                school.editTeacher(emailTeacher, cousreTeacher, newEmailTeacher, newNameTeacher, newAgeTeacher, newGenderTeacher, newPhoneNumberTeacher, newAdrressTeacher, newCousresTeacher, choose1);
                                teacher.displayCourses();
                                school.dislpayTeacher();
                            }
                            break;

                        case "b":
                            System.out.println("Enter student's email:");
                            String emailStudent = sc.nextLine();
                            System.out.println("Enter student's major:");
                            String majorStudent = sc.nextLine();
                            Student student = school.findStudent(emailStudent, majorStudent);
                            if (student == null) {
                                System.out.println("No student found with the given email and major.");
                            } else {
                                school.dislpayStudent();
                                System.out.println("Enter student's new email:");
                                String newEmailStudent = sc.nextLine();
                                System.out.println("Enter student's new name:");
                                String newNameStudent = sc.nextLine();
                                System.out.println("Enter student's new age:");
                                int newAgeStudent = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter student's new gender:");
                                String newGenderStudent = sc.nextLine();
                                System.out.println("Enter student's new phone number:");
                                String newPhoneNumberStudent = sc.nextLine();
                                System.out.println("Enter student's new adrress:");
                                String newAdrressStudent = sc.nextLine();

                                Map<String, List<String>> newMajorCourseStudent = new HashMap<>();
                                List<String> newCoursesStudent = new ArrayList<>();

                                while (true) {
                                    System.out.println("Enter a new course (or 'done' to finish)");
                                    String newCourseStudent = sc.nextLine();
                                    if (newCourseStudent.equalsIgnoreCase("done"))
                                        break;
                                    newCoursesStudent.add(newCourseStudent);
                                    newMajorCourseStudent.put(majorStudent, newCoursesStudent);
                                }
                                System.out.println("Choose an option: ");
                                System.out.println("Enter c: Keep the current major and add the new courses to the current courses");
                                System.out.println("Enter d: Keep the current major, remove the current courses and add the new courses");
                                System.out.println("Enter e: Set a new major and add the new courses");

                                String choose2 = sc.nextLine();
                                if (choose2.equalsIgnoreCase("e")) {
                                    System.out.println("Enter student's new major: ");
                                    String newMajorStudent = sc.nextLine();
                                    school.editStudent(emailStudent, majorStudent, newEmailStudent, newNameStudent, newAgeStudent, newGenderStudent, newPhoneNumberStudent, newAdrressStudent, newMajorStudent, newMajorCourseStudent, choose2);
                                }

                                school.editStudent(emailStudent, majorStudent, newEmailStudent, newNameStudent, newAgeStudent, newGenderStudent, newPhoneNumberStudent, newAdrressStudent, majorStudent, newMajorCourseStudent, choose2);
                                System.out.println("Student information after updating.");
                                student.displayMajorCouurses();
                                school.dislpayStudent();
                            }
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;

                case "5":
                    System.out.println("Choose an option: ");
                    System.out.println("Enter a: Download information teacher to file.");
                    System.out.println("Enter b: Download information student to file.");
                    String option5 = sc.nextLine();
                    switch (option5) {
                        case "a":
                            File fileTeacher = new File("D:\\QUẢN LÍ GIÁO VIÊN VÀ SINH VIÊN\\Giáo viên\\Giáo viên.txt");
                            school.dowloadDataTeacherFile(fileTeacher);
                            break;

                        case "b":
                            File fileStudent = new File("D:\\QUẢN LÍ GIÁO VIÊN VÀ SINH VIÊN\\SInh viên\\Sinh viên.txt");
                            school.dowloadDataStudentFile(fileStudent);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;
              /*  case "6":
                    System.out.println("Choose an option: ");
                    System.out.println("Enter a: Load teacher information from file.");
                    System.out.println("Enter b: Load student information from file.");
                    String option6 = sc.nextLine();
                    switch (option6) {
                        case "a":
                            File fileTeacher = new File("D:\\QUẢN LÍ GIÁO VIÊN VÀ SINH VIÊN\\Giáo viên\\Giáo viên.txt");
                            school.loadDataTeacherFile(fileTeacher);
                            break;

                        case "b":
                            File fileStudent = new File("D:\\QUẢN LÍ GIÁO VIÊN VÀ SINH VIÊN\\SInh viên\\Sinh viên.txt");
                            school.loadDataStudentFile(fileStudent);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;*/

                case "0":
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
            }
            System.out.println("Press 'Enter' to continue..");
            String next = sc.nextLine();
            if (next.equalsIgnoreCase("next"))
                continue;
        }
    }
}


package Project_Manager_Teacher_and_Student;

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
            System.out.println("| Enter 5: To exit the program.                                                     |");
            System.out.println("-------------------------------------------------------------------------------------");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
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
                            sc.nextLine();
                            System.out.println("Enter teacher's gender: ");
                            String teacherGender = sc.nextLine();
                            System.out.println("Enter teacher's phonenumber: ");
                            String teacherPhoneNumber = sc.nextLine();
                            System.out.println("Enter teacher's address: ");
                            String teacherAddress = sc.nextLine();
                            Teacher teacher = new Teacher(teacherEmail, teacherName, teacherAge, teacherGender, teacherPhoneNumber,
                                                          teacherAddress);
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
                            Student student = new Student(studentEmail, studentName, studentAge, studentGender, studentPhoneNumber,
                                                          studentAddress, studentMajor);

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
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;
                case "2":
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
                    System.out.println("Enter a: To find a teacher by email or course. ");
                    System.out.println("Enter b: To find a student by email or major. ");
                    String option3 = sc.nextLine();
                    switch (option3) {
                        case "a":
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

                        case "b":
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
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                    }
                    break;

                case "4":
                    System.out.println("Enter a: Edit information teacher.");
                    System.out.println("Enter b: Edit information student.");
                    String option4 = sc.nextLine();
                    switch (option4) {
                        case "a":
                            System.out.println("Enter teacher's email:");
                            String emailTeacher = sc.nextLine();
                            System.out.println("Enter teacher's course:");
                            String cousreTeacher = sc.nextLine();
                            Teacher teacher = school.findTeacher(emailTeacher, cousreTeacher);
                            if (teacher == null) {
                                System.out.println("No teacher found with the given email and course.");
                            } else {
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

                                List<String> newCousresTeacher = new ArrayList<>();
                                while (true) {
                                    System.out.println("Enter a new course (or 'done' to finish)");
                                    String newCourseTeacher = sc.nextLine();
                                    if (newCourseTeacher.equalsIgnoreCase("done"))
                                        break;
                                    newCousresTeacher.add(newCourseTeacher);
                                }
                                school.editTeacher(emailTeacher, cousreTeacher, newEmailTeacher, newNameTeacher, newAgeTeacher,
                                        newGenderTeacher, newPhoneNumberTeacher, newAdrressTeacher, newCousresTeacher);
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
                                System.out.println("Enter student's new major:");
                                String newmajorStudent = sc.nextLine();

                                Map<String, List<String>> newMajorCourseStudent = new HashMap<>();
                                List<String> newCoursesStudent = new ArrayList<>();
                                while (true) {
                                    System.out.println("Enter a new course (or 'done' to finish)");
                                    String newCourseStudent = sc.nextLine();
                                    if (newCourseStudent.equalsIgnoreCase("done"))
                                        break;
                                        newCoursesStudent.add(newCourseStudent);
                                        newMajorCourseStudent.put(newmajorStudent, newCoursesStudent);
                                }
                                school.editStudent(emailStudent, majorStudent, newEmailStudent, newNameStudent, newAgeStudent,
                                                   newGenderStudent, newPhoneNumberStudent, newAdrressStudent, newmajorStudent,
                                                    newMajorCourseStudent);
                                student.displayMajorCouurses();
                              }
                                 break;
                        default:
                            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
                            }
                            break;

                case "5":
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
            System.out.println("Press 'Enter' to continue..");
            String next = sc.nextLine();
            if (next.equalsIgnoreCase("next"))
                continue;
        }
    }
}


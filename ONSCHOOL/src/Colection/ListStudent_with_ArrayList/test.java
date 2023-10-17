package Colection.ListStudent_with_ArrayList;

import java.io.File;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudent listStudent = new ListStudent();
        while (true) {
            System.out.println("MENU---------------------");
            System.out.println("Please choose function: ");
            System.out.println(
                    "1. Add students to the list. \n"
                  + "2. Print the student list to the screen. \n"
                  + "3. Check if the list is empty or not. \n"
                  + "4. Get the number of students in the list. \n"
                  + "5. Empty the student list. \n"
                  + "6. Check if the student exists in the list, based on the student code. \n"
                  + "7. Remove a student from the list based on student code \n"
                  + "8. Search all students based on Name entered from the keyboard. \n"
                  + "9. Output to the screen a list of students with scores from high to low. \n"
                  + "10. To save list student. \n "
                  + "11. To read list student in file. \n"
                  + "12. Exit program.");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                  try {
                      System.out.println("Enter student's id");
                      String id = sc.nextLine();
                      System.out.println("Enter student's name");
                      String name = sc.nextLine();
                      System.out.println("Enter student's birth year");
                      int birthYear = sc.nextInt();
                      System.out.println("Enter student's medium score");
                      float mediumScore = sc.nextFloat();
                      sc.nextLine();
                      Student student = new Student(id, name, birthYear, mediumScore);
                      listStudent.addStudent(student);
                  } catch (NumberFormatException e) {
                      System.out.println("Invalid input. Please enter a valid number for birth year and medium score.");                  }
                    break;

                case "2":
                    listStudent.printfListStudent();
                    break;

                case "3":
                    System.out.println("Empty list: "+ listStudent.checkListEmpty());
                    break;

                case "4":
                    System.out.println("Number of students on the list: "+ listStudent.getNumberStudent());
                    break;

                case "5":
                    listStudent.emptyListStudent();
                    break;

                case "6":
                    System.out.println("Enter a id: ");
                    String iD = sc.nextLine();
                    Student student1 = new Student(iD, true);
                    System.out.println("Check for student on the list: "+listStudent.checkExist(student1));
                    break;
                case "7":
                    System.out.println("Enter a id: ");
                    String ID = sc.nextLine();
                    Student student2 = listStudent.removeStudent(ID);
                    if (student2 != null)
                        System.out.println("Student " + student2.getName() + " with ID" +ID + "has been removed from the list.");
                    else
                        System.out.println("No student with ID " + ID + " found in the list.");
                     break;

                case "8":
                    System.out.println("Enter student's name");
                    String nAme = sc.nextLine();
                    Student student3 = listStudent.findStudent(nAme);
                    if (student3!= null)
                        System.out.println("Found Student " + student3.toString());
                    else
                        System.out.println("No student with name " + nAme + " found in the list.");
                    break;

                case "9":
                    listStudent.arrangeStudent();
                    listStudent.printfListStudent();
                    break;

                case "10":
                    System.out.println("Enter name file: ");
                    String nameFile = sc.nextLine();
                    File f = new File(nameFile);
                    listStudent.writeDataFile(f);
                    break;

                case "11":
                    System.out.println("Enter name file: ");
                    String nameFile1 = sc.nextLine();
                    File f1 = new File(nameFile1);
                    listStudent.readDataFile(f1);
                    break;
                default:
                    System.out.println("Please, enter number 1 to 12");
            }
            System.out.println("Press 'Enter' to continue..");
            String next = sc.nextLine();
            if (next.equalsIgnoreCase("next"))
                continue;
        }
    }
}
 // D:\ViDu\Ahihi\save.txt
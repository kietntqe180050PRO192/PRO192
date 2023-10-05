package ListStudent_with_ArrayList;

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
                  + "0. Exit program.");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
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
                    Student student1 = new Student(iD);
                    System.out.println("Check students are on the list: "+ listStudent.checkExist(student1));
                    break;

                case "7":
                    System.out.println("Enter a id: ");
                    String ID = sc.nextLine();
                    Student student2 = new Student(ID);
                    System.out.println("Remove students in the list: "+ listStudent.removeStudent(student2));
                    break;

                case "8":
                    System.out.println("Enter student's name");
                    String nAme = sc.nextLine();
                    Student student3 = new Student(nAme);
                    System.out.println("Result: "+ listStudent.findStudent(String.valueOf(student3)));
                    break;
            }
            System.out.println("Press 'Enter' to continue..");
            String next = sc.nextLine();
            if (next.equalsIgnoreCase("next"))
                continue;

        }
    }
}

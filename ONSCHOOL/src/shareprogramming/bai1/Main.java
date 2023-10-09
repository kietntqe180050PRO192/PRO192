package shareprogramming.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerAll managerAll = new ManagerAll();
        while (true) {
            System.out.println("Press 'Enter' to continue..");
            String next = sc.nextLine();
            if (next.equalsIgnoreCase("next"))
            continue;
            System.out.println("<------------MENU----------->");
            System.out.println("Enter 1: Add new officers.");
            System.out.println("Enter 2: Search by last name.");
            System.out.println("Enter 3: Display information about the list of officers.");
            System.out.println("Enter 4: Exit the program..");
            String choose1 = sc.nextLine();
            switch (choose1) {
                case "1":
                    System.out.println("Enter a: Add worker's infomation.");
                    System.out.println("Enter b: Add Engineer's infomation.");
                    System.out.println("Enter c: Add Staff's infomation.");
                    String choose2 = sc.nextLine();
                    switch (choose2) {
                        case "a":
                            System.out.println("Enter Worker's name: ");
                            String nameWorker = sc.nextLine();
                            System.out.println("Enter worker's age: ");
                            int ageWorker = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter worker's gender: ");
                            String genderWorker = sc.nextLine();
                            System.out.println("Enter worker's address: ");
                            String addressWorker = sc.nextLine();
                            System.out.println("Enter worker's level: ");
                            int level = sc.nextInt();
                            Worker worker = new Worker(nameWorker, ageWorker, genderWorker, addressWorker, level);
                            managerAll.addOfficer(worker);
                            break;

                        case "b":
                            System.out.println("Enter Engineer's name: ");
                            String nameEngineer = sc.nextLine();
                            System.out.println("Enter Engineer's age: ");
                            int ageEngineer = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Engineer's gender: ");
                            String genderEngineer = sc.nextLine();
                            System.out.println("Enter Engineer's address: ");
                            String addressEngineer = sc.nextLine();
                            System.out.println("Enter Engineer's major: ");
                            String major = sc.nextLine();
                            Engineer engineer = new Engineer(nameEngineer, ageEngineer, genderEngineer, addressEngineer, major);
                            managerAll.addOfficer(engineer);
                            break;

                        case "c":
                            System.out.println("Enter Staff's name: ");
                            String nameStaff = sc.nextLine();
                            System.out.println("Enter Staff's age: ");
                            int ageStaff = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Staff's gender: ");
                            String genderStaff = sc.nextLine();
                            System.out.println("Enter Staff's address: ");
                            String addressStaff = sc.nextLine();
                            System.out.println("Enter Staff's work: ");
                            String work = sc.nextLine();
                            Staff staff = new Staff(nameStaff, ageStaff, genderStaff, addressStaff, work);
                            managerAll.addOfficer(staff);
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    Officer officer = managerAll.findOfficer(name);
                    if (officer != null)
                        System.out.println("Found officer" + officer.toString());
                    else
                        System.out.println("No officer with" + name + " found in the list");
                    break;
                case "3":
                    managerAll.displayOfficer();
                    break;
                case "4":
                    sc.close();
                    return;
                default:
                    System.out.println("Please, enter number 1 to 4");
            }
        }
    }
}


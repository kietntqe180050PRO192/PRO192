package Lab01;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập họ của bạn: ");
        String lastName = sc.nextLine();
        System.out.println("Mời nhập tên lót của bạn: ");
        String middleName = sc.nextLine();
        System.out.println("Mời nhập tên của bạn: ");
        String firstName = sc.nextLine();

        System.out.println("Tên đầy đủ của bạn là: " + lastName +" "+middleName +" "+firstName);

    }
}

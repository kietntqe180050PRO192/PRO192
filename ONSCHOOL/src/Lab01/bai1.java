package Lab01;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chooos;
        do {
            System.out.println("Mời nhập số a: ");
            double a = sc.nextDouble();
            System.out.println("Mời nhập số b: ");
            double b = sc.nextDouble();
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            if (b != 0)
                System.out.println("a / b = " + (a / b));
            else
                System.out.println("Lỗi: không thể chia cho số 0!");
            sc.nextLine();
            System.out.println("Bạn có muốn tiếp tục không ? (nhập 'có' để tiếp tục, nhập bất kỳ để dừng): ");
            chooos = sc.nextLine();
        } while (chooos.equalsIgnoreCase("có"));
    }
}
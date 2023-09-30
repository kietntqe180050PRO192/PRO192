package Lab01;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm chuyên cần: ");
        double attendanceScore = sc.nextDouble();

        System.out.println("Nhập điểm giữa kỳ: ");
        double midTermScore = sc.nextDouble();

        System.out.println("Nhập điểm cuối kỳ: ");
        double finalTermScore = sc.nextDouble();

        // Giả sử rằng điểm chuyên cần chiếm 10%, điểm giữa kỳ chiếm 30% và điểm cuối kỳ chiếm 60% tổng điểm.
        double totalScore = attendanceScore * 0.1 + midTermScore * 0.3 + finalTermScore * 0.6;

        System.out.println("Điểm học phần của bạn là: " + totalScore);

    }
}

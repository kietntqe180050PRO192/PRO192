package Lab01;

import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        ArrayList<String>  nameList = new ArrayList<>();
        nameList.add("Nguyễn Tuấn Kiệt");
        nameList.add("Trần Hạ Khương Duy");
        nameList.add("Vũ Văn Đại");
        nameList.add("Lương Gia Khánh");
        nameList.add("Trần Mạnh Khuê");
        nameList.add("Trần Minh Quân");

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập họ tên: ");
        String name = sc.nextLine();

        if (nameList.contains(name))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

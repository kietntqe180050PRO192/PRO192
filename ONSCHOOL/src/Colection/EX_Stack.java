package Colection;

import java.util.Scanner;
import java.util.Stack;

public class EX_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stackChuoi = new Stack<>();

        // stackChuoi.push("giatri") => đưa giá trị vào stack
        // stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
        // stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
        // stackChuoi.clear(); => xóa tất cả phần tử trong stack
        // stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
        // stackChuoi.size() => độ lớn của stack

        // ví dụ dảo ngược chuỗi
        System.out.println("Nhập vào chuỗi: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        // ví dụ chuyên từ hệ thập phân sang nhị phân
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int x = sc.nextInt();
        while (x > 0) {
            int soDu = x%2;
            System.out.println(soDu);
            stackSoDu.push(soDu+"");
            x=x/2;
        }
        System.out.println("Số nhị phân là: ");
        int n = stackSoDu.size();
        for(int i = 0; i < n; i++) {
            System.out.println(stackSoDu.pop());
        }
    }
}

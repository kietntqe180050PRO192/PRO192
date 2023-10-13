package Colection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("NTK 1");
        danhSachSV.offer("NTK 2");
        danhSachSV.offer("Nguyễn Tuấn A");
        danhSachSV.offer("Nguyễn Tuấn B");

        while (true) {
            String name = danhSachSV.poll(); //lấy ra và xóa
            if (name==null) {
                break;
            }
            // peek => lấy ra nhưng không xóa
            System.out.println(name);
        }
    }
}

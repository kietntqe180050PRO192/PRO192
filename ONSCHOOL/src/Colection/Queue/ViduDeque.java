package Colection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViduDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("NTK 1");
        danhSachSV.offer("Nguyễn Tuấn A");
        danhSachSV.offer("Nguyễn Tuấn B");
        danhSachSV.offer("Trịnh Văn A");
        danhSachSV.offerFirst("NTK 3");
        danhSachSV.offerLast("KKK");



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


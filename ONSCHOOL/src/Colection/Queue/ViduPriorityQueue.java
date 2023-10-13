package Colection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<String>();

        danhSachSV.offer("NTK 1");
        danhSachSV.offer("Nguyễn Tuấn A");
        danhSachSV.offer("Nguyễn Tuấn B");
        danhSachSV.offer("NTK 2");

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


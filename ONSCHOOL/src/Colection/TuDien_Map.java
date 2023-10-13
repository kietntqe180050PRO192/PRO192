package Colection;

import java.util.*;

public class TuDien_Map {
    private Map<String, String> duLieu = new TreeMap<String, String>();

    public String themTu(String key, String value) {
        return this.duLieu.put(key, value);
    }

    public String xoaTu(String key) {
        return this.duLieu.remove(key);
    }

    public String traTu(String key) {
        String value = this.duLieu.get(key);
        return value;
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong() {
        return this.duLieu.size();
    }

    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuDien_Map tuDienMap = new TuDien_Map();
        int chosse = 0;
        do {
            System.out.println("============================");
            System.out.println("MENU");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");
            chosse = sc.nextInt();
            sc.nextLine();
            if (chosse == 1) {
                System.out.println("Nhập vào từ khóa: ");
                String key = sc.nextLine();
                System.out.println("Nhập vào từ ý nghĩa: ");
                String value = sc.nextLine();
                tuDienMap.themTu(key, value);
            } else if (chosse == 2 || chosse == 3) {
                System.out.println("Nhập vào từ khóa: ");
                String key = sc.nextLine();
                if (chosse==2) {
                    tuDienMap.xoaTu(key);
                } else {
                    System.out.println("Ý nghĩa là: "+tuDienMap.traTu(key));
                }
            } else if (chosse==4) {
                tuDienMap.inTuKhoa();
            } else if (chosse==5) {
                System.out.println("Số lượng từ khóa là: "+tuDienMap.laySoLuong());
            } else if (chosse==6) {
                tuDienMap.xoaTatCa();
            }
        } while (chosse != 0);
    }
}
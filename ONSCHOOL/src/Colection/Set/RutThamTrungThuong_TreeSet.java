package Colection.Set;

import java.util.*;

public class RutThamTrungThuong_TreeSet {
    //Sử dụng treeset thì có thứ tự

    Set<String> thungPhieuTrungThuong = new TreeSet<String>();

    public RutThamTrungThuong_TreeSet() {
    }

    public boolean themPhieu(String giaTri) {
        return this.thungPhieuTrungThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuTrungThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.thungPhieuTrungThuong.contains(giaTri);
    }

    public void xoaTacCaCacPhieu() {
        this.thungPhieuTrungThuong.clear();
    }

    public int laySoLuong() {
        return this.thungPhieuTrungThuong.size();
    }

    public String rutMotPhieu() {
        String ketQua ="";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuTrungThuong.size());
        ketQua = (String) this.thungPhieuTrungThuong.toArray()[viTri];
        return ketQua;
    }

    public void inTatCa () {
        System.out.println(Arrays.toString(this.thungPhieuTrungThuong.toArray()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
        do {
            System.out.println("---------------------------------------");
            System.out.println("MENU:  ");
            System.out.println("Nhập 1: Thêm mã số dự thưởng.");
            System.out.println("Nhập 2: Xóa mã số dự thưởng.");
            System.out.println("Nhập 3: Kiểm tra các mã số dự thưởng có tồn tại hay không. ");
            System.out.println("Nhập 4: Xóa tất cả các phiếu dự thưởng.");
            System.out.println("Nhập 5: Số lượng phiếu dự thưởng.");
            System.out.println("Nhập 6: Rút thăm trúng thưởng.");
            System.out.println("Nhập 7: In ra tất cả các phiếu.");
            System.out.println("Nhập 0: Thoát khỏi chương trình");
            choose = sc.nextInt();
            sc.nextLine();
            if(choose==1 || choose ==2 || choose==3) {
                System.out.println("Nhập vào mã phiếu dự thưởng: ");
                String giaTri = sc.nextLine();
                if (choose == 1) {
                    rt.themPhieu(giaTri);
                } else if (choose == 2) {
                    rt.xoaPhieu(giaTri);
                } else {
                    System.out.println("Kết quả Kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
                }
            }
            else if (choose==4) {
                rt.xoaTacCaCacPhieu();
            } else if (choose==5) {
                System.out.println("Số lượng phiếu: "+rt.laySoLuong());
            } else if (choose==6) {
                System.out.println("Mã trúng thưởng: "+rt.rutMotPhieu());
            } else if (choose==7) {
                System.out.println("Các mã phiếu dự thưởng: ");
                rt.inTatCa();
            }
        }while (choose!=0);
    }
}



package EX.Interface;

import EX.Interface.KeThuaInterface;

public class Test {
    public static void main(String[] args) {
        KeThuaInterface kt1 = new KeThuaInterface();
        double kq1 =kt1.tinhLuong(200, 21);
        System.out.println(kq1);
        }
    }

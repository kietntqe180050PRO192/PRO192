package Interface;

import com.sun.security.auth.module.Krb5LoginModule;

public class Test {
    public static void main(String[] args) {
        KeThuaInterface kt1 = new KeThuaInterface();
        double kq1 =kt1.tinhLuong(200, 21);
        System.out.println(kq1);
        }
    }

package IO;

import java.io.File;

public class ViDuXoaFile {
    public static void xoaFile(File fx) {
        if (fx.isFile()) {
            // xóa nếu là tâp tin
            System.out.println("Đã Xóa: "+fx.getAbsoluteFile());
            fx.delete();
        } else if (fx.isDirectory()) {
            // lấy các file con
            File[] mangCon = fx.listFiles();
            for (File f : mangCon) {
                // xóa các file con
                xoaFile(f);
            }
            // xóa bản thân thư mục sau khi đã xóa các file con
            fx.delete();
        }
    }
    public static void main(String[] args) {
        File fn = new File("D:\\ViDU\\Fn");
        File f2 = new File("D:\\ViDU\\F1\\F2 ");
        File f0 = new File("D:\\ViDU\\F0");


      /*  fn.deleteOnExit(); // xóa thư mục rỗng
        ViDuXoaFile.xoaFile(f0);*/
        
    }
}

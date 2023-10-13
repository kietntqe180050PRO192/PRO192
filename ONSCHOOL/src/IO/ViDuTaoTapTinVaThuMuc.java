package IO;
import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
    // Lưu ý:
    // MS Windows: \ => \\ | Ví dụ: "C:\\Thu muc 1\\Thuc muc\\Ten tap tin.xxx";
    // Linux, MacOS: / | Ví dụ: /Thu muc 1/Thuc muc 2 /Ten tap tin.xxx"
    public static void main(String[] args) {
        // pt exitsts ktra thu muc hay tap tin có ton tai hay ko
        File folder1 = new File("D:\\PRO192\\ONSCHOOL\\src\\Colection");
        File folder2 = new File("D:\\PRO192\\ONSCHOOL\\src\\Colection\\c");

        System.out.println("Kiem tra folder1 có tồn tại ko: "+folder1.exists());
        System.out.println("Kiem tra folder2 có tồn tại ko: "+folder2.exists());

        // Tạo thư mục
        // Phương thức mkdir() => Tạo 1 thư mục
        File d1 = new File("D:\\CSI\\Directory_1");
        d1.mkdir();

        // Phương thức mkdirs() => Tạo nhìu thư mục cùng lucs
        File d2 = new File("D:\\CSI\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();

        // Tạo tập tin ( có phần mở rộng: .ext, .txt, .doc, xls.....)
        File file1 = new File("D:\\CSI\\Directory_1\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            //ko có quyền tạo tệp tin
            // ổ cứng ầy
            // đường dẫn sai
            throw new RuntimeException(e);
        }


    }
}

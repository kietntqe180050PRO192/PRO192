package IO;

import java.io.File;
import java.util.Scanner;

public class ViduFile {
    File file;

    public ViduFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public static void main(String[] args) {
        int choose = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("MENU----------");
            System.out.println("1. Kểm tra file có thể thực thi: ");
            System.out.println("2. Kểm tra file có thể thực đọc: ");
            System.out.println("3. Kểm tra file có thể thực ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In ten file: ");
            System.out.println("6. Kểm tra file là thư mục hoặc là tệp tin:");
            System.out.println("7. In danh sách file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát chương trình: ");





        }
    }
}

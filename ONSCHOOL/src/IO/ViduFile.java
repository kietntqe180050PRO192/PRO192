package IO;

import java.io.File;
import java.util.Scanner;

public class ViduFile {
    File file;

    public ViduFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi () {
        return this.file.canExecute(); //ktra file có thể thực thi hay ko
    }

    public boolean kiemTraDoc () {
        return this.file.canRead(); //ktra file có thể đọc hay ko
    }

    public boolean kiemTraGhi () {
        return this.file.canWrite(); //ktra file có thể ghi hay ko
    }

    public void inDuongDan () {
        System.out.println(this.file.getAbsoluteFile());
    }

    public void inTen () {
        System.out.println(this.file.getName());
    }


    public void kiemTraLaThuMucHayTapTin () {
        if(this.file.isDirectory()) {
            System.out.println("Đây là thư mục");
        } else if (this.file.isFile()) {
            System.out.println("Đây là tệp tin");
        }
    }

    public void inDanhSachCacFileCon () {
        if(this.file.isDirectory()) {
            System.out.println("Các tập tin con/ thư mục con là:");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsoluteFile());
            }
        } else if (this.file.isFile()) {
            System.out.println("Đây là tệp tin, ko có dữ liệu con bên trong");
        }
    }

    public void inCayThuMuc() {
        this.inChiTietCayThuMuc(this.file, 1);

    }

    public void inChiTietCayThuMuc(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThuMuc(fx, bac + 1);
                }
            }
        }


    public static void main(String[] args) {
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên file: ");
        String tenFile = sc.nextLine();
        ViduFile viduFile = new ViduFile(tenFile);

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
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(viduFile.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(viduFile.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(viduFile.kiemTraGhi());
                    break;
                case 4:
                    viduFile.inDuongDan();
                    break;
                case 5:
                    viduFile.inTen();
                    break;
                case 6:
                    viduFile.kiemTraLaThuMucHayTapTin();
                    break;
                case 7:
                    viduFile.inDanhSachCacFileCon();
                    break;
                case 8:
                    viduFile.inCayThuMuc();
                    break;


                default:
                    break;


            }





        }
    }
}

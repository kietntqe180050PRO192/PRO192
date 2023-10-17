package IO;

import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\ViDu\\Ahihi\\123.txt", "UTF-8");
            pw.println("Xin chào, mình là Kiệt");
            pw.print("Dữ Liệu: ");
            pw.print(3.14);
            pw.print(' ');
            pw.print(" là số PI");
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

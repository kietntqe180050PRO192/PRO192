package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocText {

    public static void main(String[] args) {

/* Cách 1
        File f = new File("D:\\ViDu\\Ahihi\\123.txt");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = br.readLine();
                if(line==null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/
        // Cách 2
          File f2 = new File("D:\\\\ViDu\\\\Ahihi\\\\123.txt");
          try {
              List allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
              for (Object line : allText) {
                  System.out.println(line);
              }
          } catch (Exception e) {
              e.printStackTrace();
          }

    }
}


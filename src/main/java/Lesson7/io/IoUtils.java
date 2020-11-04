package Lesson7.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IoUtils {

    private static final String PREFIX = "root_dir/";

    public static void readData(String fileName) throws IOException {
        File file = new File(PREFIX + fileName);
        FileInputStream fis = new FileInputStream(file);

        FileOutputStream fos = new FileOutputStream
                (new File(PREFIX + "copy.txt"));
        fis.transferTo(fos);
        fis.close();
        fos.close();

//        StringBuilder sb = new StringBuilder();
//        int cur;
//        byte[] buffer = new byte[8192];
//        while((cur = fis.read(buffer)) != -1) {
////            for (int i = 0; i < 8192; i++) {
////                sb.append((char)buffer[i]);
////            }
//            fos.write(buffer, 0, cur);
//        }
//        fis.close();
//        fos.close();
////        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        readData("1.txt");
    }
}

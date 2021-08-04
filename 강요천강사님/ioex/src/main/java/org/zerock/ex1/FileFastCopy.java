package org.zerock.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileFastCopy {

    public static void main(String[] args) {

        //try with resource
        try (InputStream fin = new FileInputStream("C:\\zzz\\sample.txt");
             OutputStream fos = new FileOutputStream("C:\\zzz\\copy.txt");
        ) {
            byte[] arr = new byte[5]; //8kb

            while (true) {
                int count = fin.read(arr); //몇 개나 새로운 데이터를 읽었나

                System.out.println("COUNT: " + count);
                System.out.println(Arrays.toString(arr));

                if (count == -1) { // -1 더 이상 읽을 구문이 없다면
                    break;
                }
//                fos.write(arr, 0, count);
                fos.write(arr);
            }//end while

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

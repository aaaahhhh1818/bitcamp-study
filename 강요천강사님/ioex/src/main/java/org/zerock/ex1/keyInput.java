package org.zerock.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class keyInput {

    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = null;
        try {
            out = new FileOutputStream("C:\\zzz\\test.txt");

            for (int i = 0; i < 10; i++) {
                int data = in.read(); //1byte의 내용을 읽는다.
                out.write(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //close()는 반드시 따로 닫아 줘야함
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {}
            }
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {}
            }
        }
    }
}

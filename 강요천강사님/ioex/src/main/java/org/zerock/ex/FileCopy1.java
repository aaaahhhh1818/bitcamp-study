package org.zerock.ex;

import java.io.*;
import java.net.URL;

public class FileCopy1 {

    //bad code
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://newsimg.sedaily.com/2020/10/01/1Z8YNMADIC_1.jpg");
        InputStream in = url.openStream();

        System.out.println(in);

        OutputStream out = new FileOutputStream("C:\\images\\copy.jpg");

        while(true) {

            int data = in.read();

            if(data == -1) { break; }

            out.write(data);
        }//end while
    }
}

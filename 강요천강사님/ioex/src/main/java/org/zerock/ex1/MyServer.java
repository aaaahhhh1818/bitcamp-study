package org.zerock.ex1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    //bad code close 철저히
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("Ready...");

        while(true) {
            Socket client = serverSocket.accept();
            System.out.println(client);

            OutputStream out = client.getOutputStream();

            File file = new File("C:\\zzz\\bbb.jpg");

            //HTTP의 헤더메세지 라고 함
            out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
            out.write(new String("Cache-Control: private\r\n").getBytes());
            out.write(new String("Content-Length: "+file.length()+"\r\n").getBytes());
            out.write(new String("Content-Type: image/jpeg\r\n\r\n").getBytes());

//            out.write(97);
            InputStream fin = new FileInputStream("C:\\zzz\\bbb.jpg");

            byte[] buffer = new byte[1024*8];

            while(true) {
                int count = fin.read(buffer);
                if(count == -1) { break; }
                out.write(buffer, 0, count);

            }//end while

            //일부러 close를 늦게 실행해 파일이 다 뜰 수 있게 함
//            Thread.sleep(500);

            fin.close();

            out.close();
            client.close();

        }//end while

    }
}

package org.zerock.ex1;

import javax.swing.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class OneToOneClient {

    //bad code
    public static void main(String[] args) throws Exception {

        Scanner keyScanner = new Scanner(System.in);
        Socket socket = new Socket("192.168.0.8", 9999);

        System.out.println("Connected....");

        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        Scanner inScanner = new Scanner(in);

        //100번 반복 가능
        for(int i = 0; i < 100; i ++) {
            //문자열을 byte[] 바꿔서 out.write(바이트배열)
            //String msg = "밥은 먹고 다니냐?\n"; //server의 scanner가 읽을 때 \n 필요
            String msg = keyScanner.nextLine() + "\n";

            out.write(msg.getBytes());
            System.out.println("------------------------");
            System.out.println(inScanner.nextLine());

        }//end for


        out.close();
        socket.close();

    }

}

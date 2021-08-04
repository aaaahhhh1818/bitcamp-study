package org.zerock.ex2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class DataClient {

    //bad code
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your message");

        String msg = scanner.nextLine();

        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out); //UTF방식으로 문자열을 보냄(문자열을 보내는 방식 중 하나)
        InputStream in = socket.getInputStream();
        DataInputStream din = new DataInputStream(in);

        dos.writeUTF(msg);
        System.out.println("-----------------");
        String serverMsg = din.readUTF();
        System.out.println(serverMsg);


    }

}

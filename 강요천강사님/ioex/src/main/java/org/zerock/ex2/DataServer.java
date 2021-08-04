package org.zerock.ex2;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DataServer {

    //bad code
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9998);
        System.out.println("ready...");

        while(true) {

            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            DataInputStream din = new DataInputStream(in);
            OutputStream out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);

            String str = din.readUTF(); //UTF문자열 한번에 읽을 수 있음

            System.out.println("CLIENT MSG: " + str);

            String msg = "AHYONI";

            dos.writeUTF(msg);
            dos.flush();

        }

    }
}

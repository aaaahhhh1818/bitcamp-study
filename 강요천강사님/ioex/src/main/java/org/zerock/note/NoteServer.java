package org.zerock.note;

import com.google.gson.Gson;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NoteServer {

    //bad code
    public static void main(String[] args) throws Exception {

        //serversocket
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Ready...");

        //loop
        while (true) {

            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream =
                    new DataInputStream(socket.getInputStream());
            String msg = dataInputStream.readUTF();

            Gson gson = new Gson();

            Command command = gson.fromJson(msg, Command.class);

            System.out.println(command);

        }

        //socket

        //DataInputStream readUTF() => 문자열

        //Gson => 문자열을 Command 객체

        //Command 객체의 oper 값이 ADD면 service.add()

    }

}

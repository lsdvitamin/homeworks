package ru.otus.java.basic.homeworks.hw20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import static ru.otus.java.basic.homeworks.Util.eval;

/**
 * @author Sergei on 18.06.2024 14:21.
 * @progect homeworks
 */
public class PrintServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777, 1);
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Client is connected");
            while (true) {
                processRequest(client);
            }
        }
    }

    public static void processRequest(Socket client) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String request = in.readLine();
        if (request.equals("Hello")) {
            System.out.println("Request from client: " + request);
            String message = "Please select any available operation: +,-,*,/";
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
            out.writeUTF(message);
            out.flush();
        } else {
            System.out.println("Request from client: " + request);
            String message = "Answer: " + eval(request);
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
            out.writeUTF(message);
            out.flush();
        }

    }

}

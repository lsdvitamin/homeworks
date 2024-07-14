package ru.otus.java.basic.homeworks.hw20.client;

import java.io.*;
import java.net.Socket;

/**
 * @author Sergei on 18.06.2024 14:33.
 * @project homeworks
 */
public class PingClient {
    private final DataInputStream in;
    private final DataOutputStream out;


    public PingClient(Socket socket) throws IOException {
        this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String message) throws IOException {
        String messageWithEndStr = message + "\n";
        out.write(messageWithEndStr.getBytes());
        out.flush();
    }

    public String read() throws IOException {
        return in.readUTF();
    }


}

package ru.otus.java.basic.homeworks.hw20.client;

import javax.script.ScriptException;
import java.net.Socket;
import static ru.otus.java.basic.homeworks.Util.inputString;

/**
 * @author Sergei on 18.06.2024 15:02.
 * @progect homeworks
 */
public class Main {
    public static void main(String[] args) throws ScriptException {
        String result = null;

        try (Socket socket = new Socket("localhost", 7777)) {
            PingClient pingClient = new PingClient(socket);

            while (result != "exit") {
                pingClient.send("Hello");
                result = pingClient.read();
                System.out.println(result);
                String calcStr = inputString();
                pingClient.send(calcStr);
                result = pingClient.read();
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

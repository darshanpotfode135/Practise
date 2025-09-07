import java.io.*;
import java.net.*;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server running at http://0.0.0.0:8080/");
        while (true) {
            Socket client = server.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println("HTTP/1.1 200 OK\r\n");
            out.println("Hello from Docker + Java on AWS!");
            client.close();
        }
    }
}

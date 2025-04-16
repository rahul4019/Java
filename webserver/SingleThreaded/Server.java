import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() {
        int port = 8010;
        ServerSocket socket = new ServerSocket(port); // opening a socket at defined port
        socket.setSoTimeout(10000); // closes the socket if doesn't get the connection in defined time

        while (true) {
            try {
                System.out.println("Server is listing on Port" + port);
                Socket acceptedConnection = socket.accept(); // accepting the connection
                System.out.println("Connection accepted from client " + acceptedConnection.getRemoteSocketAddress());

                /*
                 * acceptedConnection.getOutputStream() gives access to output stream and
                 * printWriter provides us functionality to write text to the stream
                 */
                PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());

                /*
                 * acceptedConnection.getInputStream() gives access to input stream and
                 * BufferedReader provides us functionality to read entire lines or chunks
                 */
                BufferedReader fromClient = new BufferedReader(
                        new InputStreamReader(acceptedConnection.getInputStream()));

                toClient.println("Hello from the server");

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
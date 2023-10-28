import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {

    public static void main(String[] args) throws IOException {
        // Create a new server socket on port 8080.
         System.out.println("New Java Server on localhost:8080 ");
        ServerSocket serverSocket = new ServerSocket(8080);

        // Accept incoming connections.
        while (true) {
            Socket clientSocket = serverSocket.accept();

            // Read the request from the client.
            InputStream inputStream = clientSocket.getInputStream();
            byte[] request = new byte[1024];
            int bytesRead = inputStream.read(request);

            // Parse the request to get the requested file.
            String requestedFile = new String(request, 0, bytesRead).split(" ")[1];

            // Serve the requested file.
            if (requestedFile.equals("/index.html")) {
                serveIndexHtml(clientSocket);
            } else {
                // Serve a 404 error page.
                serve404Error(clientSocket);
            }

            // Close the client socket.
            clientSocket.close();
        }
    }

    private static void serveIndexHtml(Socket clientSocket) throws IOException {
        // Open the index.html file for reading.
        InputStream inputStream = new FileInputStream("/index.html");

        // Write the index.html file to the client.
        OutputStream outputStream = clientSocket.getOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        // Close the input and output streams.
        inputStream.close();
        outputStream.close();
    }

    private static void serve404Error(Socket clientSocket) throws IOException {
        // Write a 404 error page to the client.
        OutputStream outputStream = clientSocket.getOutputStream();
        String errorMessage = "<h1>404 Not Found</h1>";
        outputStream.write(errorMessage.getBytes());
        outputStream.close();
    }
}
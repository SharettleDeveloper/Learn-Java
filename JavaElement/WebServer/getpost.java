package JavaElement.WebServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class getpost {
    public static void main(String[] args) throws IOException {

        int port = 8082;
        HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

        server.createContext("/", new RootHandler());

        server.setExecutor(null);
        server.start();
        System.out.println("サーバーがポート"+port+"で起動しまっした");
    }

    static class RootHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException{
            String requestMethod = exchange.getRequestMethod();

            if(requestMethod.equalsIgnoreCase("GET")){
                String response = "This is a GET request";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();

            }else if (requestMethod.equalsIgnoreCase("POST")){
                String response = "This is a POST request";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
            
        }
    }
}

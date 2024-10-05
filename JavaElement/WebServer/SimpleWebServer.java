package JavaElement.WebServer;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {
        // ポート8080でサーバーを作成
        HttpServer server = HttpServer.create(new InetSocketAddress(8082), 0);
        
        // "/"のパスにアクセスがあったときに応答するハンドラーを設定
        server.createContext("/", new RootHandler());
        
        // サーバーを起動
        server.setExecutor(null); // デフォルトのスレッドプールを使う
        server.start();
        System.out.println("サーバーがポート8082で起動しました。");
    }

    // ルートパスのリクエストを処理するハンドラー
    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello, Web Server from Java!";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
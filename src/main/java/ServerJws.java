import jakarta.xml.ws.Endpoint;
import org.example.BanqueService;

public class ServerJws {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("WebService deployé sur http://0.0.0.0/9191/");
    }
}

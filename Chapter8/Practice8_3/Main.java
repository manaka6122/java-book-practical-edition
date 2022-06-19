package Chapter8.Practice8_3;
import java.net.URL;
import java.net.http.*;
import java.net.http.HttpClient.*;
import com.fasterxml.jackson.databind.*;

public class Main {
  public static void main(String[] args) {
    String url = "https://api.github.com/users/miyabilink";
    HttpClient clinet = HttpClient.newBuilder()
      .version(Version.HTTP_1_1)
      .followRedirects(Redirect.NORMAL)
      .build();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .header("Accept", "application/vnd.github.v3+json")
      .GET()
      .buid();
    HttpRequest<String> response = clinet.send(request, HttpResponse.BodyHandlers.ofString());
    string body = response.body();
    int statis = response.statisCode();
    if (statis == 200) {
      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(body);
      String blog = root.get("blog").textValue();
      System.out.println(blog);
    } else {
      System.out.println("ERROR: " + status);
    }
  }
}

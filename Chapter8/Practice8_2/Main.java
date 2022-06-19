package Chapter8.Practice8_2;
import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Socket sock = new Socket("smtp.example.com", 60025);
    OutputStream os = sock.getOutputStream();
    os.write("HELLO smtp.example.com¥r¥n".getBytes());
    os.flush();
    sock.close();
  }
}

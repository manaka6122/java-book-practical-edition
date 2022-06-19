package Chapter8.Code8_3;
import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("起動完了");
    ServerSocket svSock = new ServerSocket(19648);
    Socket sock = svSock.accept();
    System.out.println(sock.getInetAddress() + "から検索");
    sock.getOutputStream().write("WELCOME".getBytes());
    sock.close();
  }
}

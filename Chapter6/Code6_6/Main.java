package Chapter6.Code6_6;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String msg = "第1土曜日は資源ゴミの回収です。";
    Reader sr = new StringReader(msg);
    System.out.print((char)sr.read());  // 「第」を表示
    System.out.print((char)sr.read());  // 「1」を表示
  }
}

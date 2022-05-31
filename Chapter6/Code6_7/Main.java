package Chapter6.Code6_7;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    baos.write(65);
    baos.write(65);
    byte[] data = baos.toByteArray();  // dataは要素２のbyte型配列
    for (byte b : data) {
      System.out.println(b);
    }
  }
}

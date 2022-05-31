package Chapter6.Practice6_1;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String inFile = args[0];
    String outFile = args[1];
    FileInputStream fis = new FileInputStream(inFile);
    FileOutputStream fos = new FileOutputStream(outFile);
    int i = fis.read();
    while (i != -1) {
      fos.write(i);
      i = fis.read();
    }
    fos.flush();
    fos.close();
    fis.close();
  }
}

package Chapter6.Code6_5;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (
     //自動的にclose()が呼び出されるためfinallyの記述は不要
     FileWriter fw = new FileWriter("rpgsave.dat", true);
    ) {
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      System.out.println("ファイル書き込みエラーです");
    }
  }
}

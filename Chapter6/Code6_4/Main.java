package Chapter6.Code6_4;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = null; //tryブロックの外で宣言しnullで初期化しないと、finallyブロック内でclose()を呼べない
    try {
      fw = new FileWriter("rpgsave.dat", true);
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      System.out.println("ファイル書き込みエラーです");
    } finally {               // ファイルを閉じるためのfinallyブロック
      if (fw != null) {
        try {                 // close()がIOExceptionを送出する可能性があるため、再度try-catchが必要
          fw.close();
        } catch (IOException e2) {}
      }
    }
  }
}

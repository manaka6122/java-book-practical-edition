package Chapter4.Code4_2;

public class Main {
  public static void main(String[] args) {
    System.out.println("計算を開始します");
    // 何らかの計算処理
    System.out.println("計算終了。結果をメモ帳で表示します");
    ProcessBuilder pb = new ProcessBuilder(
      "c:¥¥windows¥¥system32¥¥notepad.exe",  // 「メモ帳」の実行ファイル
      "calcreport.txt"
    );
    pb.start();  //起動
  }
}

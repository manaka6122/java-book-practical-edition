package Chapter7.Code7_3;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String s = "ミナト, アサカ, スガワラ";
    String[] st = s.split(",");  // カンマをデリミタ指定
    for (String t : st) {
      System.out.println(t);
    }
  }
}

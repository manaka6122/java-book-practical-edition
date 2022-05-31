package Chapter4.Code4_5;
import java.util.*;
import java.text.*;

public class Main {
  public static void main(String[] args) {
    Locale loc = Locale.getDefault(); // デフォルトロケールを取得
    System.out.println(loc.getCountry() + "-" + loc.getLanguage());
    String now = (new SimpleDateFormat()).format(new Date());
    if (loc.getLanguage().equals("ja")) {
      System.out.println("現在の時刻は" + now);
    } else {
      System.out.println("Current time is" + now);
    }
  }
}

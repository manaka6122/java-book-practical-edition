package Chapter3.practice3_2;

public class FuncList {
  public static boolean isOdd(int x) {return (x % 2 == 1);}
  public String passCheck(int point, String name) {
    return name + "さんは" + (point > 65 ? "合格" : "不合格");
  }
}

package Chapter1.code1_5;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Hero> list = new HashSet<>();
    Hero h1 = new Hero();
    h1.name = "ミナト";
    list.add(h1);
    System.out.println("要素数は=" + list.size());
    h1 = new Hero();
    h1.name = "ミナト";
    list.remove(h1);
    System.out.println("要素数は=" + list.size());
  }
}

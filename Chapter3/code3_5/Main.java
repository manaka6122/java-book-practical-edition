package Chapter3.code3_5;
import java.util.*;

public class Main {
  public static void  main(String[] args) {
    List<Account> list = new ArrayList<>();

    Collections.sort(list, (x,y) -> (x.zandaka - y.zandaka));
  }
}

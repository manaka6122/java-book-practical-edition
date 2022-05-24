package Chapter3.code3_6;
import java.util.*;

public class Main {
  public static void main(String args[]) {
    List<Hero> heroes = new ArrayList<>();

    boolean anyoneKnokedOut = false;
    for (Hero h : heroes) {
      if (h.hp == 0) {
        anyoneKnokedOut = true;
        break;
      }
    }
  }
}

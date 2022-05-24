package Chapter3.code3_7;
import java.util.*;

public class Main {
  public static void main(String args[]) {
    List<Hero> heroes = new ArrayList<>();

    boolean anyoneKnokedOut = heroes.stream().anyMatch(h -> h.hp == 0);
  }
}

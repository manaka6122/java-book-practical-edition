package Chapter1.code1_9;
import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account> {
  public int compare(Acount x, Acount y) {
    return (x.zandaka - y.zandaka);
  }
}

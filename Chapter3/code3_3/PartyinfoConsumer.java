package Chapter3.code3_3;
import java.util.Set;

@FunctionalInterface
public interface PartyinfoConsumer {
  public abstract void process(Set<Hero> party, Hero leader, String pName);
}

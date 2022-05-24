package Chapter1.code1_6;
import java.util.Objects;

public class Hero {
  String name;
  int hp;

  public int hashCode() {
    return Objects.hash(this.name, this.hp);
  }
}

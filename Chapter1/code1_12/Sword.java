package Chapter1.code1_12;

public class Sword implements Cloneable {
  private String name;

  public Sword clone() {
    Sword result = new Sword();
    result.name = this.name;
    return result;
  }
}

package Chapter1.code1_10;

public class Hero implements Cloneable {
  String name;
  int hp;
  Sword sword;

  public Hero clone() {
    Hero result = new Hero();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.seord;
    return result;
  }
}

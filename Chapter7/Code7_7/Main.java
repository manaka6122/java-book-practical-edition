package Chapter7.Code7_7;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ResourceBundle rb = ResourceBundle.getBundle("jp.miyabilink.rpg.rpgdata");
    String heroName = rb.getString("heroName");       // ↑クラスパスを起点とし、jp¥miyabilink¥rpg
    System.out.println("勇者の名前:" + heroName);          // フォルダ内のrpgdata.propertiesを指示。
  }                                                        // 末尾に「.properties」は記述しない。
}

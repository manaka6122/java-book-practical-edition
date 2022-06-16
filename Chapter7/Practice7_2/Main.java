package Chapter7.Practice7_2;
import java.util.ResourceBundle;

public class Main {
  public static void main(String[] args) throws Exception {
    ResourceBundle rb = ResourceBundle.getBundle("pref");
    System.out.println(rb.getString("aichi.capital") + ":" + rb.getString("aichi.food"));
  }
}

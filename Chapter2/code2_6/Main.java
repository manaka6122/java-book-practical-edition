package Chapter2.code2_6;

public class Main {
  Pocket<String> p = new Pocket<>();
  p.put("1192");
  String s = p.get();
  System.out.println(s);
}

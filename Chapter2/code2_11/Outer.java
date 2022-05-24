package Chapter2.code2_11;

public class Outer {
  int outerField; static int outrtStaticField;
  static class Inner {
    void innerMethod() {
      outrtStaticField = 10;
    }
  }
  void outerMethod() {
    Inner ic = new Inner();
  }
}

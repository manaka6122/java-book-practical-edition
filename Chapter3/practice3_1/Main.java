package Chapter3.practice3_1;

import Chapter3.practice3_2.Func1;

public class Main {
  public static void main(String[] args) {
    FuncList funcList = new FuncList();
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = funcList::passCheck;
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "Smith"));
  }
}

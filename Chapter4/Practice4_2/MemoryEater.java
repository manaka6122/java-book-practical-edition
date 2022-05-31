package Chapter4.Practice4_2;
import java.util.*;

public class MemoryEater {
  public static void main(String[] args) {
    if (Locale.getDefault().getLanguage().equals("ja")) {
      System.out.println("メモリを消費しています...");
    }
    long[] larray = new long[1280000];
    for (int i = 0; i < larray.length; i++) {
      larray[i] = i;
    }
  }
}

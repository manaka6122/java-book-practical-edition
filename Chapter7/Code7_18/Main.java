package Chapter7.Code7_18;
import java.util.zip.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    try (ZipFile file = new ZipFile("rpg.jar")) {  // JARファイルも実態はZIPファイルなので開くことができる
      for (ZipEntry e : Cellections.list(file.entries())) {
        System.out.println(e.getName() + "size=" + e.getComperessedSize());
      }
    }
  }
}

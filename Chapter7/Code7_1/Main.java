package Chapter7.Code7_1;

import java.io.*;

public class Main {
  public void SvaHeroToFile(Hero h) throws IOException {
    Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
    w.write(h.name + "¥n");  // 名前の末尾に改行をつけて保存
    w.write(h.hp + "¥n");  // HPの末尾に改行をつけて保存
    w.write(h.mp + "¥n");  // MPの末尾に改行をつけて保存
    w.flush();
    w.close();
  }
}

package Chapter7.Code7_12;
import java.io.*;

public class Main {
  public Hero loadHeroFormatFile() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));
    String name = br.readLine();  // 改行までを名前として読む
    String hp = br.readLine();    // 改行までをHPとして読む
    String mp = br.readLine();    // 改行までをMPとして読む
    br.close();
    return new Hero(name, Integer.parseInt(hp), Integer.parseInt(mp));
  }
}

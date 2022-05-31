package Chapter5.Code5_5;
import org.apache.logging.log4j.*;

public class Main {
  public static void main(String[] args) {
    Logger logger = LogManager.getLogger(Main.class);
    if (args.length != 2) {
      logger.error("起動時引数の数が異常:" + args.length);
    }
  }
}

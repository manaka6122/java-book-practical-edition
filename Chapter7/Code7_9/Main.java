package Chapter7.Code7_9;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("rpgsava.xml");
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
    Element hero = doc.getDocumentElement();
    Element weapon = findChildByTag(hero, "weapon");
    Element power = findChildByTag(weapon, "power");
    String value = power.getTextContent();
  }
  static Element findChildByTag(Element self, String name) throws Exception {
    NodeList children = self.getChildNodes();              // 全ての子を取得
    for (int i = 0; i < children.getLength(); i++) {
      Element e = (Element)children.item(i);
      if (e.getTagName().equals(name)) {
        return e;
      }
    }
    return null;
  }
}

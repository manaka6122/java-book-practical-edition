package Chapter5.Code5_4;
import org.apache.commons.lang3.builder.*;

public class Bank {
  String name;
  String address;

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
}

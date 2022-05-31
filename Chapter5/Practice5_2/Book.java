package Chapter5.Practice5_2;
import org.apache.logging.log3.builder.*;

public class Book implements Comparable<Book>, Cloneable {
  
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }
  public int compareTo(Book o) {
    return CompareToBuilder.reflectionCompare(
      this, o, "comment", "title");
  }
}

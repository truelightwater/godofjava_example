package e.io.object;
import java.io.Serializable;

public class SeriaDTO implements Serializable {
  static final long serialVersionUTD = 1L;

  private String bookType = "IT";
  private String bookName;
  transient private int bookOrder;
  private boolean bestSeller;
  private long soldPerDay;

  public SeriaDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
    super();
    this.bookName = bookName;
    this.bookOrder = bookOrder;
    this.bestSeller = bestSeller;
    this.soldPerDay = soldPerDay;
  }

  @Override
  public String toString() {
    return "SeriaDTO [bookName = " + bookName + ", bookOrder = " + bookOrder + ", bestSeller = " + bestSeller +
        ", soldPerDay = " + soldPerDay + ", bookType = " + bookType + "]";
  }
}

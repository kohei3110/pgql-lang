package oracle.pgql.lang.ir;

import java.util.List;

import static oracle.pgql.lang.ir.PgqlUtils.printPgqlString;

public class OrderBy {

  private final List<OrderByElem> elements;

  public OrderBy(List<OrderByElem> elements) {
    this.elements = elements;
  }
  
  public List<OrderByElem> getElements() {
    return elements;
  }
  
  @Override
  public String toString() {
    return printPgqlString(this);
  }
}

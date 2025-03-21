public class Table implements Furniture {
  private final double size;

  public Table(double size) {
      this.size = size;
  }

  public double getSize() {
      return size;
  }

  @Override
  public double accept(ShippingCost visitor) {
      return visitor.visit(this);
  }
}
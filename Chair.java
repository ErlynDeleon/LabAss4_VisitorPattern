public class Chair implements Furniture {
  private final double weight;

  public Chair(double weight) {
      this.weight = weight;
  }

  public double getWeight() {
      return weight;
  }

  @Override
  public double accept(ShippingCost visitor) {
      return visitor.visit(this);
  }
}

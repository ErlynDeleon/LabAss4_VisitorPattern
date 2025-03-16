public class Sofa implements Furniture {
  private final double distance;

  public Sofa(double distance) {
      this.distance = distance;
  }

  public double getDistance() {
      return distance;
  }

  @Override
  public double accept(ShippingCost visitor) {
      return visitor.visit(this);
  }
}

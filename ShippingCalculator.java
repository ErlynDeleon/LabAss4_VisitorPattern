public class ShippingCalculator implements ShippingCost {
  @Override
  public double visit(Chair chair) {
      return 10; 
  }

  @Override
  public double visit(Table table) {
      return table.getSize() * 1.5; 
  }

  @Override
  public double visit(Sofa sofa) {
      return sofa.getDistance() * 2;
  }
}

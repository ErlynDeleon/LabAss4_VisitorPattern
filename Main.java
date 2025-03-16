public class Main {
  public static void main(String[] args) {
    Furniture[] items = {
        new Chair(1),    
        new Table(5),   
        new Sofa(20)    
    };

    ShippingCost calculator = new ShippingCalculator();

    for (Furniture item : items) {
        double cost = item.accept(calculator);
        System.out.println("Shipping cost: $" + cost);
    }
}
}

package structuralpatterns.composite;

public class Beverage implements  IMenuItem{
    private String name;
    private double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
    @Override
    public void print() {
        System.out.println("Beverage " + name + " price :" +price);
    }
}

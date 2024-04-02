package structuralpatterns.composite;

// Composite class
import java.util.ArrayList;
import java.util.List;

class ComboMeal implements IMenuItem {
    private String name;
    private List<IMenuItem> items = new ArrayList<>();

    public ComboMeal(String name) {
        this.name = name;
    }

    public void addItem(IMenuItem item) {
        items.add(item);
    }

    public void removeItem(IMenuItem item) {
        items.remove(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (IMenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void print() {
        System.out.println("Combo: " + name);
        for (IMenuItem item : items) {
            item.print();
        }
        System.out.println("Total Price: $" + getPrice());
    }
}

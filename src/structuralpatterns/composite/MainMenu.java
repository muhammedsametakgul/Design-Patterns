package structuralpatterns.composite;

import java.awt.*;

public class MainMenu implements  IMenuItem{
    private String name;
    private double price;

    public MainMenu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Main menu " + name + " price :" +price);
    }
}

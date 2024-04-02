package structuralpatterns.composite;

public class Main {
    public static void main(String[] args) {
        MainMenu steak= new MainMenu("Steak",110.0);
        MainMenu salad=new MainMenu("Salad",10.0);
        Beverage soda=new Beverage("Soda",5.0);

        ComboMeal combo1 = new ComboMeal("Combo 1");
        combo1.addItem(steak);
        combo1.addItem(salad);
        combo1.addItem(soda);

        MainMenu pasta = new MainMenu("Pasta", 15.99);
        Beverage water = new Beverage("water", 4.0);

        ComboMeal combo2 = new ComboMeal("Combo 2");
        combo2.addItem(pasta);
        combo2.addItem(water);

        ComboMeal comboMeal = new ComboMeal("Special Combo");
        comboMeal.addItem(combo1);
        comboMeal.addItem(combo2);

        comboMeal.print();
    }
}

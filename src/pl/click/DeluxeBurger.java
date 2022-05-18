package pl.click;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Pork", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0.00);
        super.addHamburgerAddition2("Drink", 0.00);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
}

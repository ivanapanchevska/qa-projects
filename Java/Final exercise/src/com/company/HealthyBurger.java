package com.company;

public class HealthyBurger extends Hamburger{
    private boolean soySauce;
    private static final int HEALTHY_BURGER_PRICE = 15;

    public HealthyBurger(boolean soySauce) {
        super("Brown Bread roll", "Soy Meat");
        this.soySauce = soySauce;
    }

    @Override
    public void additions(boolean lettuce, boolean tomato, boolean pickles) {
        super.additions(lettuce, tomato, pickles);
    }

    private int additionsPrice;
    private int grandTotal;

    public void calculateHealthyBurgerAdditions() {
        additionsPrice = super.calculateHamburgerAdditions();
        int soySauce = 4;
        grandTotal = HEALTHY_BURGER_PRICE;

        if (this.soySauce) {
            additionsPrice += soySauce;
            grandTotal += additionsPrice;
            System.out.println("#Soy Sauce Added: $" + soySauce);
        }
    }

    @Override
    public void getReceipt() {
        System.out.println("************HEALTHY BURGER ORDER************");
        System.out.println("----------Basics----------");
        System.out.println("#Bread Type: Brown Bread roll");
        System.out.println("#Meat: Soy Meat");

        calculateHealthyBurgerAdditions();

        System.out.println("----------Grand Total Price----------");
        System.out.println("##Hamburger Basic Price: $" + HEALTHY_BURGER_PRICE);
        System.out.println("Additions Total Price: $" + additionsPrice);
        System.out.println("##Grand TOTAL: $" + grandTotal);
    }
}

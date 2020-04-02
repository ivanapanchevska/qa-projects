package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Long Large Seeded Bread", "Chopped Beef");
    }

    @Override
    public void additions(boolean lettuce, boolean tomato, boolean pickles) {
        System.out.println("Cannot add additional items in Deluxe Burger except it's default!");
    }

    @Override
    public void getReceipt() {
        int deluxeBurgerPrice = 20;
        int frenchFries = 5;
        int cocaCola = 3;

        int additions = frenchFries + cocaCola;
        int grandTotal = additions + deluxeBurgerPrice;

        System.out.println("************DELUXE BURGER ORDER************");
        System.out.println("----------Basics----------");
        System.out.println("#Bread Type: Long Large Seeded Bread");
        System.out.println("#Meat: Chopped Beef");
        System.out.println("----------Grand Total Price----------");
        System.out.println("##Hamburger Basic Price: $" + deluxeBurgerPrice);
        System.out.println("Additions Total Price: $" + additions);
        System.out.println("##Grand TOTAL: $" + grandTotal);
    }
}

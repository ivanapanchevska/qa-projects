package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger basicBurger = new Hamburger("Roll", "Beef");
        basicBurger.additions(true, true, true);
        basicBurger.getReceipt();

        System.out.println(" ");

        HealthyBurger healthyBurger = new HealthyBurger(true);
        healthyBurger.additions(true, true, true);
        healthyBurger.getReceipt();

        System.out.println(" ");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.additions(true, true, true);
        deluxeBurger.getReceipt();
    }
}

package JavaBasics._13;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();


        //Write your code here
        Random numbersRandom = new Random();

        for (int i = 0; i < 8; i++){
          int next = numbersRandom.nextInt(8);
          numbers.add(next);
        }


        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);


        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Pizza");
        menuItems.add("Tomato");
        menuItems.add("Hamburger");
        menuItems.add("KFC");

        ArrayList<Double> menuPrices = new ArrayList<>();
        menuPrices.add(7.99);
        menuPrices.add(9.99);
        menuPrices.add(3.99);
        menuPrices.add(10.99);

        System.out.println("The items is = " + menuItems.get(2) +" and its price is" + " " + menuPrices.get(2));
        System.out.println("The items is = " + menuItems.get(0) +" and its price is" + " " + menuPrices.get(0));
        System.out.println("The items is = " + menuItems.get(1) +" and its price is" + " " + menuPrices.get(1));
        System.out.println("The items is = " + menuItems.get(3) +" and its price is" + " " + menuPrices.get(3));
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here

        System.out.println(items[0] + items[1] + items[2] + items[3] + items[4] + items[5] + items[6] + items[7] + items[8] + items[9]);
    }
}


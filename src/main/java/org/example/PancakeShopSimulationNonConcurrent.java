package org.example;

import java.util.Random;

public class PancakeShopSimulationNonConcurrent {
    public static void main(String[] args) {
        final int TOTAL_USERS = 3;
        final int MAX_PANCAKES_PER_USER = 5;
        final int MAX_PANCAKES_PER_SHOPKEEPER = 12;
        final int SIMULATION_DURATION_SECONDS = 30;

        Random random = new Random();

        int totalPancakesMade = 0;
        int totalPancakesEaten = 0;
        int totalOrdersNotMet = 0;
        int totalPancakesWasted = 0;

        for (int seconds = 0; seconds < SIMULATION_DURATION_SECONDS; seconds++){
            int pancakesMadeByShopkeeper= random.nextInt(MAX_PANCAKES_PER_SHOPKEEPER + 1);
            totalPancakesMade += pancakesMadeByShopkeeper;

            int[] pancakesOrdered = new int[TOTAL_USERS];
            for (int i = 0 ; i < TOTAL_USERS; i++){
                pancakesOrdered[i] = random.nextInt(MAX_PANCAKES_PER_USER +1);
            }

            int pancakesEatenByUsers = 0;
            for (int i=0; i < TOTAL_USERS; i++ ){
                int pancakesToEat = Math.min(pancakesOrdered[i], MAX_PANCAKES_PER_USER - pancakesEatenByUsers);
                pancakesEatenByUsers += pancakesToEat;
            }

            int pancakesWasted = pancakesMadeByShopkeeper - pancakesEatenByUsers;
            if (pancakesWasted < 0 ){
                totalOrdersNotMet += Math.abs(pancakesWasted);
                pancakesWasted = 0;
            }

            totalPancakesEaten += pancakesEatenByUsers;
            totalPancakesWasted += pancakesWasted;

            System.out.println("Time Slot: " + (seconds + 1));
            System.out.println("pancakes made by shopkeeper: " + pancakesMadeByShopkeeper);
            System.out.println("Pancakes eaten by users: " + pancakesEatenByUsers);
            System.out.println("Pancakes wasted: " + pancakesWasted);
            System.out.println("Orders not met: " + totalOrdersNotMet);
            System.out.println("-----------------------------------------");
        }

        System.out.println("Total pancakes made: " + totalPancakesMade);
        System.out.println("Total pancakes eaten: " + totalPancakesEaten);
        System.out.println("Total pancakes wasted: " + totalPancakesWasted);
        System.out.println("Total orders not met: " + totalOrdersNotMet);





    }
}
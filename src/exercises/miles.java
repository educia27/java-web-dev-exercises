package exercises;

import java.util.Scanner;

public class miles {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many miles have you driven? ");
        double distance = input.nextDouble();

        System.out.println("how much gas did you consume? ");
        double gas = input.nextDouble();

        double milesPerGallon = distance / gas;

        System.out.println("Your driving efficiency is " + milesPerGallon + " miles per gallon.");


    }
}

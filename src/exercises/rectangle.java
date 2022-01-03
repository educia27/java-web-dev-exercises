package exercises;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length:");
        double l= input.nextDouble();
        System.out.println("Enter the breadth:");
        double b= input.nextDouble();


        double  area=l*b;
        System.out.println("Area of Rectangle is: " + area);
    }
}

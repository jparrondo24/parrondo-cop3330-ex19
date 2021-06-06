package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your weight? (pounds) ");
        double weight = in.nextDouble();
        System.out.print("What is your height? (inches) ");
        double height = in.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f.\n", bmi);
        if (bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi < 25)
            System.out.println("You are within the ideal weight range.");
        else
            System.out.println("You are overweight. You should see your doctor.");
    }
}

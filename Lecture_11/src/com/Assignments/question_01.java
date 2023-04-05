package com.Assignments;

import java.util.Scanner;

public class question_01 {
    public static void main(String[] args) {
        // Define a method to print maximum of three numbers. Read the numbers as input from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = in.nextFloat();
        System.out.print("Enter second number: ");
        float b = in.nextFloat();
        System.out.print("Enter third number: ");
        float c = in.nextFloat();

        maxOfThreeNumbers(a,b,c);
    }

    public static void maxOfThreeNumbers(float a, float b, float c){
        float[] numbers = new float [3];
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;

        float k = numbers[0];

        for (float number : numbers) {
            if (k < number) {
                k = number;
            }
        }
        System.out.println("The maximum of three numbers is : " + k);
    }
}

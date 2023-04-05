package com.Assignments;

import java.util.Scanner;

public class question_03 {
    public static void main(String[] args) {
        // Q. Write a program to check if a given triplet is pythagorean triplet
        System.out.println("Enter three numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean answer = isPythagoreanTriplet(a,b,c);
        System.out.println("The numbers " + a + ", " + b + " and " + c + " are Pythagorean Triplets: " + answer);
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c){
        boolean isTriplet = false;
        if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
            isTriplet = true;
        } else if (Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2)) {
            isTriplet = true;
        } else if (Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)) {
            isTriplet = true;
        }
        return isTriplet;
    }
}

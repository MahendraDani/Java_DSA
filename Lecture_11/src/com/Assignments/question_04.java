package com.Assignments;

import java.util.Scanner;

public class question_04 {
    public static void main(String[] args) {
        // Q. Write the program that returns sum of first 'n' natural numbers
        System.out.print("Enter the number of natural numbers of which sum is to be found : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = sumOfNaturalNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is : " + answer);
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }

}

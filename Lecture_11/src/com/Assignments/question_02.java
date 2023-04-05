package com.Assignments;

import java.util.Scanner;

public class question_02 {
    public static void main(String[] args) {
        // Q. Write a program to find factorial of a  number
        System.out.print("Enter a number whose factorial is to be found : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int answer = findFactorial(num);
        System.out.println("The factorial of " + num + " is: " +answer);
    }
    public static int findFactorial(int n){
        int factorial = 1;
        for(int i=1; i<=n;i++){
            factorial = factorial * i;
        }

        return factorial;
    }
}

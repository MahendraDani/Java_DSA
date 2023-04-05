package com.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class question_05 {
    public static void main(String[] args) {
        // Q. Check whether a given number of a palindrome or not.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of digits in your number : ");
        int n = in.nextInt();
        System.out.print("Enter the number : ");
        int number = in.nextInt();

        boolean answer = isPalindromeNumber(n, number);
        System.out.println(answer);
    }
    public static boolean isPalindromeNumber(int n, int number){
        boolean isPalindrome = false;

        int[] digits = new int[n];
        boolean isEven = n % 2 ==0;

        // Pushing each digit in array
        for(int i =0; i<n;i++) {
            int eachDigit =((int)(number/Math.pow(10,i)) % 10);
            digits[i] = eachDigit;
        }

        // Checking for palindrome condition
        for(int j =0; j<n/2;j++){
            if (digits[j] == digits[n - j -1]){
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }
}


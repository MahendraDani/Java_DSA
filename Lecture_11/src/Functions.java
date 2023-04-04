// Lecture 11 : Functions / Methods in Java
// Data : 4th April 2023

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Why to use Functions ?
    /*
        1. Functions are collections of piece of code that saves us from repeating like thousand times.
        2. Functions are good! Use them a lot.
     */

        // Syntax of functions
    /*
        access modifier return_type function_name (parameters){
        // body
        return statement
        }
     */

        //Calling the function
        sum();

        int x,y,ans;
        x = 13;
        y = 20;
        ans = sum2(x,y);
        System.out.println("The sum of " + Integer.toString(x) +" and " + Integer.toString(y) + " is:  " + ans);

    }

    public static void sum(){
        Scanner in = new Scanner(System.in);
        int a, b, ans;
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
        ans = a + b;
        System.out.println("The sum of the numbers is: " + ans);

    }

    public static int sum2(int a, int b){
        return a + b;
    }
}


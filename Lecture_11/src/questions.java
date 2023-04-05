import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        // Q1. Find whether the given number is prime or not?
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));

        // Q2. Print whether the given number is Armstrong Number or not?
        System.out.print("Enter a number and we will tell you whether it's Armstrong Number or Not: ");
        int a = in.nextInt();
        System.out.println(armstrongNumbers(a));

        // Q3. Print all three digits numbers from 100 to 999
        allThreeDigitArmstrongNumbers();
    }
    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if (n%c==0) return false;
            c++;
        }
        return c*c>n;
    }
    public static boolean armstrongNumbers(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        return sum==original;
    }

    public static void allThreeDigitArmstrongNumbers(){
        int currentNumber = 100;
        while(currentNumber < 1000){
            int num = currentNumber;
            int sum = 0;

            while(num>0){
                int digit = num % 10;
                sum = sum + digit*digit*digit;
                num = num / 10;
            }
            if(sum == currentNumber){
                System.out.println(currentNumber + " is an Armstrong Number");
            }
            currentNumber ++;

        }
    }

}

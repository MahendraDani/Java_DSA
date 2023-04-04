public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapNumbers(a,b);
        System.out.println(a + " " + b);
        // Even after passing the values of a and b in the function, the values are not swapped, WHY?
        /*
            Because the reference variables a,b,x and y point to values of a and b, but in scope of the function
            the values of only copies is swapped not the original values of a and b
         */
    }
    public static void swapNumbers(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}

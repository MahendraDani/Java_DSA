public class scope {
    public static void main(String[] args) {
        /*
            Scopes:
            1. Function Scope
                The values of arguments of a function and reference variable inside the function are accessible to
                functions ONLY. They can't be used or changed outside the function. (Can't be used globally)
            2. Block Scope
                The values of reference variables initialized inside the block will remain in the block.
                (Can't be used globally)
         */

        int a =10;

        // Example of Block Scope
        {
//          int a = 10  // 'a' is already initialized outside the block in space methods, hence it can't be re-initialized
            // but the value of variable 'a' can be changed in the block

            a = 30; // reassign  the value of original value
            System.out.println(a);

            int c = 10;
        }
//        System.out.println(c);  c is inside the block hence it can't be used globally!
    }
}

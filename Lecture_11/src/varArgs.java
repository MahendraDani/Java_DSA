import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(12,222,233,43);
    }

    public static void fun(int ...a) // "int ...a" gives an array as argument to the function
    {
        System.out.println(Arrays.toString(a));
    }
}

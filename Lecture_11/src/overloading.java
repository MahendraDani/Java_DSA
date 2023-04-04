public class overloading {
    public static void main(String[] args) {
        fun(69);
        fun("Mahendra");

        /*
            To functions are said to be overloaded if they have same name and return type but DIFFERENT 'Arguments' i.e.
            1. The number of arguments in each function are different
            OR
            2. The data type of arguments are different
         */

    }
    public static void fun(int a ){
        System.out.println(a);
    }
    public static void fun(String name){
        System.out.println(name);
    }
}

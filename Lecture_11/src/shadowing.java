public class shadowing {
    static int x = 90; // This will be SHADOWED at line 6
    public static void main(String[] args) {
        System.out.println(x); //OUTPUT : 90
        int x =40; // The class variable at line 2 is shadowed by this
        System.out.println(x); // OUTPUT : 40
        fun(); // OUTPUT : 90
    }

    private static void fun() {
        System.out.println(x);
    }
}

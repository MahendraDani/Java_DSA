import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {1,23,22,9,10};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] nums) {
        nums[0] = 99;
    }
    /*
        If you make a change to the object (here the array arr) via reference variable(here the array nums), same
         object will be changed
     */

}

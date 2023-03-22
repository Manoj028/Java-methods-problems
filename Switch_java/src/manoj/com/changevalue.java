package manoj.com;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
       int[] arr = {0,8,6,4,13};
       change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 90;
    }
}

import java.util.Arrays;
public class Change_value {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr);
    }
    static void change(int[] nums){
        nums[0]=99;
    }
    
}

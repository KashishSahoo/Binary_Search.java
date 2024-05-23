import java.util.Arrays;

public class Functions_Arr {
   static void change(int [] arr){
    arr[0]=108;
   }
   public static void main(String[] args) {
    int[] nums={1,2,3,4,5};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
   }
    
}
import java.util.*;
@SuppressWarnings("unused")
public class Swap_Using_Arr {
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int [] nums={1,2,3,4,5,6};
        reverse(nums);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("After Swapping 2nd and 4th Index");
        // swap(arr, 2, 4);
        System.out.println(Arrays.toString(nums));
      
    }
}

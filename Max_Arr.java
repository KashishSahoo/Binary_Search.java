import java.util.Arrays;

public class Max_Arr {
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int [] arr={787,675,99,9797,627252,77,829};
      
        System.out.println(Arrays.toString(arr));
        System.out.println("The Max Value Is: "+max(arr));
        System.out.println("The Max Value In Range Of 1st and 3rd Index: "+maxRange(arr,1,3));
    }
}

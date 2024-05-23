public class Order_Agnostic_BS {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        int[] arr={23,45,67,89,99};
        int[] arr1={123,45,37,29,19};

        int ans=orderAgnostic(arr1, 45);
        System.out.println(ans);
        
    }

    static int orderAgnostic(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        //Find whether array is sorted in ascending or descending
         boolean isAsc=arr[start]<arr[end];
        
        while (start<=end) {
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid+1;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }     
            }

            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
            }
            return(-1);

         
    }
    
}

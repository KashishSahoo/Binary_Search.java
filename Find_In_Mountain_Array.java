public class Find_In_Mountain_Array {
    public static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
   public static int search(int[] arr,int target){
        int p=peak(arr);
        int f=orderAgnostic(arr, target,0,p);

        if(f!=-1){
            return f;
        }
        else{
            //try to search in second half..
            return orderAgnostic(arr,target, p+1,arr.length-1);
        }
    }
   
    static int orderAgnostic(int[]arr,int target,int start,int end){

        //Find whether array is sorted in ascending or descending
         boolean isAsc=arr[start]<arr[end];
        
        while (start<=end) {
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
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
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,3,1};
        int ans=search(arr,3);
        System.out.println(ans);
    }
    
}

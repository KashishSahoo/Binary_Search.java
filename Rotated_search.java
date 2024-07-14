public class Rotated_search {
    //5th June 2024
    //Not For Duplicates
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            //case 1
            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            //case 2
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            //case 3
            if (arr[mid]<=arr[start]) {
                end=mid-1;
            }
            //case 4
            else{
                start=mid+1;
            }     
        }
        return -1;
    }
    public static int search(int[] arr,int target){
        int piviot=findPivot(arr);
        //if you did not find a pivot,it means the array is not rotated.
        if(piviot==-1){
            //do binary search
           return binary(arr, target,0,arr.length-1);
        }
        //if piviot found you found two ascending sorted arrays

         //case 1
        if (arr[piviot]==target) {
            return piviot;
        }

        else if (target>arr[0]) {
           return binary(arr, target,0,piviot-1);
        }
        else
        {
            return binary(arr, target, piviot+1, arr.length-1);
        }


    }
    static int binary(int []arr,int target,int start,int end){

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return(mid);
            }
            
        }
        return(-1);
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        System.out.println(search(arr, 6));
    }
    
}

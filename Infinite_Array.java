public class Infinite_Array {
    static int Binary_Search(int[] arr,int target,int start,int end){
    
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
    static int ans(int[] arr,int target){
        //first find the range
        // first start with box of size 2
        int start=0;
        int  end=1;            

        //condition for the target to lie in the range is target is less than end
        //double the size until target element is greater than end
        //when your target element is not greater than end it lies behind end
        while (target>arr[end]) {

            int new_start=end+1;
            //double the box value
            //new_end=prev end+sizeOf(box)*2
             end=end+(end-start+1)*2;//new_end
            start=new_start;
        }
    return Binary_Search(arr, target,start,end);

    }
    public static void main(String[] args) {

        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
        
      
    }
    
}

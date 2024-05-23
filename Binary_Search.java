class Binary_Search{
    public static void main(String[] args) {
        int [] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans=Binary(arr,18);
        System.out.println(ans);
  
        
    }

    static int Binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return(mid+1);
            }
            
        }
        return(-1);
    }
}
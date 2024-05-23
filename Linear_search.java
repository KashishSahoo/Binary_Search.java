public class Linear_search {
    static int LinearrSearch(int[] arr,int s){

        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                return(i+1);
            }
        }
        return(-1);

    }

    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,16,-11,28};
        int t=19;
        int ans=LinearrSearch(nums,t);
        System.out.println("The Element Is At Location= i"+ans);
    }
}

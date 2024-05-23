public class Min {
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,9,-1,-3,0,9};
        System.out.println(+min(arr));
    }
}

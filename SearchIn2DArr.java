public class SearchIn2DArr {

    static int[] search(int[][] arr,int s){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){

                if(arr[row][col]==s){

                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
    static int max_value(int[][] arr){
        int max=arr[0][0];
        for(int[] ints:arr){
            for(int element:ints){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
   
        }

    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,7,9},
            {78,99,87,65,23},
            {18,12}
        };
        int target=65;
        int[] ans=search(arr, target);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
         System.out.print(arr[row][col]+" ");
            }
            System.out.println();
         }
         System.out.println();
        System.out.println("The Target Element "+target+" Is At Location "+(ans[0]+1)+"th Row And "+(ans[1]+1)+"th Element.");
        int m=max_value(arr);
        System.out.println(m);
    }
}

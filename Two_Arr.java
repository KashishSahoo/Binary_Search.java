import java.util.*;
public class Two_Arr {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int [][] arr= new int[3][3];
        @SuppressWarnings("unused")
        int[][] arr2D={
            {1,2,3},//0th index
            {4,5},//1st index
            {6,7,8,9}//2nd index
            //arr2D[2]={6,7,8,9}
        };
        System.out.println(arr.length);//no of rows

        //Input
        for(int row=0;row<arr.length;row++){
            //for each column in every row
           for(int col=0;col<arr[row].length;col++){
            arr[row][col]=sc.nextInt();
           }
        }

        //Output

        //for loop
        for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[row].length;col++){
        System.out.print(arr[row][col]+" ");
           }
           System.out.println();
        }
        
        //toString() Method
        for(int row=0;row<arr.length;row++){
           System.out.println(Arrays.toString(arr[row]));
        }

        //For each loop
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}

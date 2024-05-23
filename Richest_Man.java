import java.util.*;

public class Richest_Man {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Persons=");
        int row=sc.nextInt();
        System.out.println("Enter Number Of Accounts=");
        int col=sc.nextInt();
        int [][] arr= new int[row][col];
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
           }
        }
        ArrayList<Integer> list=new ArrayList<>(3);
        for(int i=0;i<row;i++){
            list.add(sum(arr[i],col));
        }
        int maxVal=list.get(0);
        for(int i=0;i<row;i++){
            if(list.get(i)>maxVal){
                maxVal=list.get(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
         }
        System.out.println(maxVal);
        

    }

    static int sum(int arr[],int col){
        int sum=0;
        for(int i=0;i<col;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

}
    


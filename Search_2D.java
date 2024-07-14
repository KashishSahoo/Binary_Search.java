import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] arr=
        {
            {18,19,12},
            {36,-4,91},
            {44,33,16}
        };
            for(int row=0;row<arr.length;row++){
           System.out.println(Arrays.toString(arr[row]));
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==91){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

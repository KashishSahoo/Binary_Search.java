import java.util.*;
public class Occur {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }  
      int occ=sc.nextInt();
      int count=0;
      for(int j=0;j<n;j++)
      {
        if(arr[j]==occ){
            count++;
        }
      }
      System.out.println("The "+occ +"has occured "+count+ "times" );
      sc.close();
    }
}

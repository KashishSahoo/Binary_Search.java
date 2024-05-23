import java.util.*;
public class Arr_input {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //array of primitives
        // int [] arr=new int[5];
        // arr[0]=4;
        // arr[1]=8;
        // arr[2]=16;
        // arr[3]=32;
        // arr[4]=40;
        // System.out.println(arr[3]);

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
          // for(int num:arr){
    //     System.out.print(num+" ");//Here num represents element of arr
    //     //for every element in arr,print the element.
    //     //for each loop
    // }
    // System.out.println(Arrays.toString(arr));// Best method to print..

    //Array of Objects..
    String[] str=new String[5];
    for(int i=0;i<str.length;i++){
        str[i]=sc.next();
    }
    System.out.println(Arrays.toString(str));
    str[3]="Prema";
    System.out.println(Arrays.toString(str));

    }
  

}
    
 



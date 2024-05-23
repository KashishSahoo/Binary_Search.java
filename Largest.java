import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        //Q1:Find the largest among three numbers?
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // int max=0;
        // if(a>b){
        //     max=a;
        // }
        // else{
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        int max=Math.max(c,Math.max(a,b));
        System.out.println("The Largest Among The Three Is "+max);
       sc.close();
        
    }
}
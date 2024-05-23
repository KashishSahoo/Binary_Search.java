import java.util.*;
public class Fibo {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n Value= ");
    int n=sc.nextInt();
    int a=0;
    int b=1;
    int c;
    System.out.print(a+" ");
    System.out.print(b+" ");
    for(int i=2;i<=n;i++){
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
    System.out.println();
    System.out.println("The nth Fibonacii no="+b);
sc.close();
   } 
}

import java.util.Scanner;

public class prime_count {
    static boolean isPrime(int num){
        if(num<=1)
           return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
               return false;

        }
        return true;
    }

    static int count_prime(int[] arr){
        int count=0;
        for(int num:arr){
            if(isPrime(num))
               count++;
        }
      return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter The Values=");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int p=count_prime(arr);
        System.out.println("Number of Prime Numbers In Array="+p);

    }    
}
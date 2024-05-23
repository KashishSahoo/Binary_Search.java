import java.util.*;
public class Rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number= ");
        int num=sc.nextInt();
        int ans=0;
        while (num>0) {
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.println("The Reverse Of The Number Is= "+ans);
        sc.close();
    }
}

import java.util.*;
public class Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number= ");
        int num=sc.nextInt();
        System.out.print("To Check Occurence= ");
        int occ=sc.nextInt();
        int count=0;
        while (num>0) {
            int rem=num%10;
            if(rem==occ){
                count++;
            }
            num=num/10;
        }
        System.out.println("The "+occ +" has occured "+count+ " times" );
      sc.close();
    }
}

import java.util.*;
public class Loops {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // for(int num=1;num<=5;num++){
        //     System.out.println(num);
        // }
        Scanner sc=new Scanner(System.in);
        @SuppressWarnings("unused")
        int nm=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     System.out.print(i+" ");
        // }
        // While Loop
        /*
         while(condition){
            body
         }
         */
        // int numb=1;
        // while(numb<=10){
        //     System.out.println(numb);
        //     numb++;
        // }
        //Do While
        /*
         do{
            body
         }while(condition);
         */
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=10);
    }
}

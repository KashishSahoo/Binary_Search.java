import java.util.*;
public class Fuctions {
    static Scanner sc=new Scanner(System.in);
    static int sum(int n1,int n2){
 
     int sum=n1+n2;
    return(sum);
    }

    static String greet(String name){
        String gr=name+" Hare Krishna!!";
        return gr;
    }
    public static void main(String[] args) {
        // System.out.println("Enter number 1=");
        // int n1=sc.nextInt();
        // System.out.println("Enter number 2=");
        // int n2=sc.nextInt();
        // int ans= sum(n1,n2);
        // System.out.println(ans);
        System.out.println("Enter Name=");
        String name=sc.nextLine();
        String g=greet(name);
        System.out.println(g);
         
        sc.close();
     }
     
     
    }
  


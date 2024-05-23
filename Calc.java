import java.util.*;

public class Calc {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int ans=0;
    while (true) {
        System.out.print("Enter The Opearator= ");
        char op=sc.next().trim().charAt(0);
        if(op=='+' || op=='-' || op=='*'|| op=='/'|| op=='%' ){
            System.out.println("Enter Two Numbers=");
            int num1=sc.nextInt();
            int num2=sc.nextInt();

            if(op=='+'){
                ans=num1+num2;
            }

            if(op=='-'){
                ans=num1-num2;
            }

            if(op=='*'){
                ans=num1*num2;
            }

            if(op=='/'){
                ans=num1/num2;
            }

            if(op=='%'){
                ans=num1%num2;
            }   
        }
        else if(op=='x'|| op=='X'){
            break;
        }
        else{
            System.out.println("Invaild Opearation");
        }
        System.out.println(ans);
    }
   
    sc.close();
    }
    
}

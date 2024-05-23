import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();

        switch (fruit) {
            case "mango":
               System.out.println("King Of Fruits!!!"); 
                break;
            case "apple":
                System.out.println("A Sweet Red Fruit!!");
                break;
            case "orange":
               System.out.println("A Round Fruit!!");
               break;
            case "grapes":
               System.out.println("A Small Fruit!!");
               break;
        
            default:
            System.out.println("Enter A Vaild Fruit!!");
                break;
        }
      sc.close();
    }
}

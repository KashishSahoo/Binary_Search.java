import java.util.*;
public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day) {
          case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
          case 3 -> System.out.println("Wednesday");
          case 4 -> System.out.println("Thrusday");
          case 5 -> System.out.println("Friday");
          case 6 -> System.out.println("Saturday");
          case 7 -> System.out.println("Sunday");
          default ->System.out.println("Enter Valid Input");
        }
        sc.close();
    }
}

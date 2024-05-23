import java.util.*;
public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String dep=sc.next();

        switch (id) {
            case 1-> System.out.println("Kashish");
            case 2-> System.out.println("Sneha");
            case 3 ->{
                System.out.println("Emp No Is 3");
                switch (dep) {
                    case "IT" ->System.out.println("Belong To IT Dept..");
                    case "Management" -> System.out.println("MBA Dept.. ");
                    default-> System.out.println("New Dept..");            
                     
            }
            
        }
        default->System.out.println("Enter Correct ID..");
    }
    sc.close();
}
}

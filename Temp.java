import java.util.*;
public class Temp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Temperature In Celsius: ");
            float c=sc.nextFloat();
            float f=(c*9/5)+32;
            System.out.println("Temp In Fahernhit= "+f);
        }
        
        
    }
}

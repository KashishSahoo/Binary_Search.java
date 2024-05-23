import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_concept {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        // list.add(89);
        // list.add(189);
        // list.add(81119);
        // list.add(89111);
        // list.add(89322);

        // System.out.println(list.contains(89111));
        // System.out.println(list);
        // list.set(0, 16);
      
        // list.remove(2);
        // System.out.println(list);

        //Input
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
         //Output
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
        }
        System.out.println(list);

    }
}

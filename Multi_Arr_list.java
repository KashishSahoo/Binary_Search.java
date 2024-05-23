import java.util.ArrayList;
import java.util.*;

public class Multi_Arr_list {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //Declaration And Initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //Add Elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        //Print Elements
        System.out.println(list);


    }
    
}

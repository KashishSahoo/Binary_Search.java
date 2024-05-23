import java.util.*;
public class Even_no_digits_elements {
    static int digit(int num){
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return(count);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        ArrayList<Integer> list1=new ArrayList<>(5);
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }

        for(int i=0;i<5;i++){
            list1.add(digit(list.get(i)));
        }
         int count=0;
        for(int i=0;i<5;i++){

            if(list1.get(i)%2==0){
                count++;
            }

        }
        System.out.println(count);
    }
}

public class Even_no_digits_elements_Method2 {

    static int find(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //Function to check Whether a number contains even no. of digits or not
    static boolean even(int num){

        int numOfDigits=digits(num);
        if(numOfDigits%2==0){
            return true;
        }
        return false;
    }

    //Count number of digits in a number
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    static int digits2(int num){

        if(num<0){
            num=num*-1;
        }
        return(int)(Math.log10(num))+1;
    }

    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(find(nums));
        int d=digits2(6688578);
        System.out.println(d);
    }
    
}

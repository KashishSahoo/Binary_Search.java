public class Functions {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }

    static boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==org;
    }
    public static void main(String[] args) {
        boolean ans=isPrime(37);
        System.out.println(ans);
        boolean ans1=isArmstrong(153);
        System.out.println(ans1);
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
        
    }
}

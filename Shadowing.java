public class Shadowing {
    static int x=16108;//This will be shadowed.wer
    public static void main(String[] args) {
        System.out.println(x);//16108
        int x;
        // System.out.println(x);
        x=108;
        System.out.println(x);//108
        //Lower Level Is Overriding Upper Level.
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
    
}



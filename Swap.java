public class Swap {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    @SuppressWarnings("unused")
    static void name(String name){
        String names="Ram";
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a=10;
        int b=12;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
        String n="Krishna";

    }
}

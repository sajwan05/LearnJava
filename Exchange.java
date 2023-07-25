public class Exchange{
    public static void main(String[] args){
        // We have to swap value of a and b
        int a=1234;
        int b=44;
        System.out.println("Value of a before swaping:"+a);
        System.out.println("Value of b before swapping:"+b);
        int t=a;
         a=b;
         b=t;
        System.out.println("Now Value of a:"+a);
        System.out.println("Value of B:"+b);
    }
}

public class IntOps{
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int sum = a+b;
        int sub= a-b;
        int prod = a*b;
        int div = a/b;
        int rem = a%b;

        System.out.println(a+" + "+b +" = "+sum);
        System.out.println(a+" - "+b +" = "+sub);
        System.out.println(a+" * "+b +" = "+prod);
        System.out.println(a+" / "+b +" = "+div);
        System.out.println(a+" % "+b +" = "+rem);
    }
}
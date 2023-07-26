public class Test4 {
    public static void main(String[] args){
        int a =Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean divOther,isPositive;
        isPositive = (a>0 && b>0);

        divOther = isPositive && ((a%b==0) || (b%a==0));
        System.out.println(divOther);
    }
}

// //  Write a program that takes three positive integers as command-line 
// arguments and prints false if any one of them is greater than or equal to the sum 
// of the other two and true otherwise.

public class Triangle{
    public static void main(String[] args){
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int c =Integer.parseInt(args[2]);
        boolean isPositive;
        boolean isFalse;
        isPositive=(a>0 && b>0&& c>0);
        isFalse=(!(a>=(b+c))) &&(!(b>=(a+c))) &&(!(c>=(a+b)))&& isPositive;

        System.out.println(isFalse);


    }
}

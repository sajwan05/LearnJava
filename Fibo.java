import java.util.Scanner;
public class Fibo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        // Fibonacci sequence 0 1 1 2 3 5 8 13 ... 
        // 
        int a = 0;
        int b = 1;
        int num=2;
        while(num<=n){
            int temp = b;
                b=b+a;
                a=temp;
                System.out.print(b+" ");
                num++;
        }
        System.out.println(" ");

    }
}
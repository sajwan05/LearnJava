package Excercises;//  Suppose that a and b are int variables. What does the following sequence
// of statements do?
// int t = a; b = t; a = b;
// I think this program will make value of a,b and t equal

public class Excercise1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int t = a;
        b = t;
        a = b;
        System.out.println("Value of a: " + a + " Value of b: " + b + "Value of t:" + t);
    }
}

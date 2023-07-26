// 1.2.3 !(a && b) && (a || b)) || ((a && b) || !(a || b))
public class Test{
    public static void main(String args[]){
        boolean a,b,isTrue;
        a=true;
        b=true;
        isTrue=(!(a && b) && (a || b)) || ((a&&b) || !(a || b));

        System.out.println(isTrue);
    }
}
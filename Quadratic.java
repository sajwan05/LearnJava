public class Quadratic{
    public static void main(String[] args){
        // i want to solve a quadratic equation
        // Prompt user for the command line input
        double b=Double.parseDouble(args[0]);
        double c=Double.parseDouble(args[1]);

        // now first calculate the discriminant
        double discriminant = b*b - 4*c;
        double d =Math.sqrt(discriminant);
        double root1=(-b+d)/2.0;
        double root2=(-b-d)/2.0;

        System.out.println("Root1: "+root1);
        System.out.println("Root2: "+root2);
    }
    }

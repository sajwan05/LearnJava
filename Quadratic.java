public class Quadratic{
    public static void main(String[] args){
        // i want to solve a quadratic equation
        // Prompt user for the command line input
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);

        // now first calculate the discriminant
        double discriminant = b*b - 4*a*c;
        if(discriminant<0) System.out.println("Polynomial have No real roots");
        else{
            double d =Math.sqrt(discriminant);
            if(a==0) System.out.println("Warning!Division by zero!");
            else{
                double root1=(-b+d)/(2.0*a);
                double root2=(-b-d)/(2.0*a);
                System.out.println("Root1: "+root1);
                System.out.println("Root2: "+root2);
            }
        }
    }
}

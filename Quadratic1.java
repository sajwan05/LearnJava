public class Quadratic1 {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double dis =(b*b - 4*a*c);
        if(dis<0) System.out.println("It have No Real roots");
        else{
            double d = Math.sqrt(dis);
            if(a==0){
                System.out.println("Warning!! Division by Zero");
            }else{
                double root1 = (-b+d)/(2*a);
                double root2 = (-b-d)/(2*a);
                System.out.println("Root1: "+root1);
                System.out.println("Root2: "+root2);
            }

            }
        }
    }
        

    
        
        
public class Eucledian {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double ed= (double)(x*x+y*y);
        double d=Math.sqrt(ed);
        System.out.println("Eucledian distance between "+x+","+y+" and origin is: "+d);
    }
}

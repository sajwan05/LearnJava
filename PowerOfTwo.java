public class PowerOfTwo {
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);
        long power =1;
        int i =0;
        while(i<=n){
            System.out.println(i+" "+power);
            power*=2;
            i++;
        }
    }
}

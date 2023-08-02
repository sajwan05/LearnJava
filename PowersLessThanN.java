public class PowersLessThanN {
    public static void main(String[] args){
        // 13 ->8 , 7->4 
        // Prompt user for the value of N
        int n = Integer.parseInt(args[0]);
        // initialize the power variable
        int power =1;
        while(power<=n/2){
            power=2*power;
        }
    }
}

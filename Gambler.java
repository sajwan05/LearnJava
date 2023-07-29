public class Gambler {
    public static void main(String[] args){
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trial = Integer.parseInt(args[2]);

        int bet = 0;
        int wins = 0;
        for(int i= 0; i <= trial;i++){
            int cash = stake;
            while(cash>0 && cash<goal){
                bet++;
                if(Math.random()<0.5) cash++;
                else                  cash--;
            }
            if (cash==goal){
                wins++;
            }
        }
        System.out.println(100*wins/trial+" %win");
        System.out.println("Avg # bet "+bet/trial);
    }
}

public class Factors {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        for (int i =2 ; i<=n/i; i++){
            while(n/i==0){
                n/=i;
                System.out.println(i+" ");
            }
            if(n>1){System.out.println(n);
            System.out.println("");}
            
        }
    }
}

public class Hello {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(i+"th Hello");
            }else{
                if(i==2){
                    System.out.println(i+"nd Hello");
                }else{
                    if(i==3){
                        System.out.println(i+"rd Hello");
                    }else{
                        System.out.println(i+"th Hello");
                    }
                }
            }
            
        }
    }
}

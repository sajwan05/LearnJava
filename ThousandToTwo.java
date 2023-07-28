public class ThousandToTwo {
    public static void main(String[] args){
        int IntPerLine = Integer.parseInt(args[0]);
        int  start = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);

        for(int i = start;i <= end; i++){
            if((i-start+1)%IntPerLine==0){
                System.out.println(i);
            }else{
                System.out.print(i+" ");
            }
        }
    }
}

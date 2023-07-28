public class Ex_1_3_7 {
    public static void main(String[] args){
        int i,j;
        for(i=0, j=0; i<10; i++){
            System.out.println(i+"First: "+j);
            j+=j++;
            System.out.println(i+"SEC: "+j);
            
        }
    }
}

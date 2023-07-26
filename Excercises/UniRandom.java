// Uniform random numbers. Write a program that prints five uniform random numbers between 0 and 1, their average value, and their minimum and maximum values.
public class UniRandom{
    public static void main(String[] args){
        double first= Math.random();
        double sec =Math.random();
        double third=Math.random();
        double fourth=Math.random();
        double fif=Math.random();

        double avg=(first+sec+third+fourth+fif)/5.0;
        double max1=Math.max(first,Math.max(sec,third));
        double maxR=Math.max(max1,Math.max(fourth,fif));
        double min1=Math.min(first,Math.max(sec,third));
        double minR=Math.min(min1,Math.min(fourth,fif));
        
        System.out.println(first);
        System.out.println(sec);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fif);
        System.out.println("The average of numbers is:"+avg);
        System.out.println("Minimum Value: "+maxR);
        System.out.println("Maximum value is: "+minR);

       }
}
public class Leapyear{
    public static void main(String[] args){
        // prompt user to enter the year to check
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;

        isLeapYear=(year%4==0)&& (year%100 !=0) || (year%400==0);

        System.out.println(isLeapYear);
    }
}
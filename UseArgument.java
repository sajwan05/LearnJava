import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class UseArgument {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello "+name+" How are you? ");
    }
}

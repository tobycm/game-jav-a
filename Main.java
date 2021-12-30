import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = input.next();
        System.out.println("Hello, " + name + "!");

        int gaypercent;
        gaypercent = new Random().nextInt(100);
        System.out.println("You are " + gaypercent + "% gay :))");
    }
}

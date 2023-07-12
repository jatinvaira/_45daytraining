import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to detect wether the number is even or not: \nNow enter the fkn number dude: ");
        int number = input.nextInt();

        String message = number%2 == 0 ? "\n your number is even buddy" : "No buddy not even";
        System.out.println(message);
    
    }
}

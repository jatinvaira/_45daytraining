import java.util.Scanner;

public class kgtopound {
    public static void main(String[] args) {
        System.out.println("Enter your current weight in kilos");
        Scanner input = new Scanner(System.in);
        double weight = input.nextInt();
        double multiplier = 2.205;
        double pound = weight * multiplier;

        System.out.println("Your weight in Pounds is: " + pound);

    }
}

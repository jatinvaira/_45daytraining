import java.util.Scanner;

public class ifelsecascade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a number: ");

        int number = input.nextInt();

        if (number == 10) {
            System.out.println("Number is equal to ten");
        }

        else if (number == 20) {
            System.out.println("Number is not equal to one or two but it's still less than 50");
        } else {
            System.out.println("The value of the variable is max");
        }

    }
}

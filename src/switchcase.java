import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 5: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            case 4:
                System.out.println("You entered 4");
                break;
            case 5:
                System.out.println("You entered 5");
                break;
            default:
                System.out.println("You did not enter a number between 1 and 5");
        }
    }
}
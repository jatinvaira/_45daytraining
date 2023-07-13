import java.util.Scanner;

public class wetherconf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current temprature from wether app :) \n\n");
        int temp = input.nextInt();
        if (temp > 10 && temp < 35) {
            System.out.println("It's a nice day for outdoor activities.");
        } else if (temp > 35 && temp < 45) {
            System.out.println("It's a little hot today");
        }

        else if (temp > 45) {
            System.out.println("It's too hot today");
        } else {
            System.out.println("It is too cold today");
        }
    }

}

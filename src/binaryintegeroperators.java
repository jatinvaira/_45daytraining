import java.util.Scanner;

public class binaryintegeroperators {

    public static void main(String[ ] args){
    Scanner input = new Scanner(System.in);

    // input from user 
    System.out.println("enter two integers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    // add two integers
    int add = num1+num2;
    System.out.println("bitwise add is: "+ add);

    // substract two integers
    int sub = num1-num2;
    System.out.println("bitwise sub is: "+ sub);

    // product of two integers

    int product = num1 * num2;
    System.out.println("bitwise product is: "+ product);

    // Quotient of two integers

    int qoutioent = num1 / num2;
    System.out.println("qoutient is:"+ qoutioent );
    

    // remaindeer

    int rem = num1%num2;
    System.out.println("reminder is: "+ rem);
}
}
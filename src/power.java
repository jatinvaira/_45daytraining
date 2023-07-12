import java.util.Scanner;
// import java.lang.Math.*;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number x and y to perform x^2 + y^2");
        double n =sc.nextInt();
        double m =sc.nextInt();

        double power1 = Math.pow( n, 2);
        double power2 = Math.pow( m, 2);

        double x=power1+power2;


        
        System.out.println("sum is "+ x);
    }
}



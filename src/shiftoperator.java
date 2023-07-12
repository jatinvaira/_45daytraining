import java.util.Scanner;

public class shiftoperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // input from user
        int x = input.nextInt();
        int y = input.nextInt();


        System.out.println("x= "+x);
        System.out.println("y= "+y);

        System.out.println("x<<2 is "+ (x<<2));
        System.out.println("y<<2 is "+ (y<<2));

        
        System.out.println("x<<2 is "+ (x>>2));
        System.out.println("y<<2 is "+ (y>>2));

        System.out.println("x<<<2 is "+ (x<<2));
        System.out.println("y<<<2 is "+ (y<<2));

        
        System.out.println("x>>>2 is "+ (x>>>2));
        System.out.println("y>>>2 is "+ (y>>>2));

    }
}

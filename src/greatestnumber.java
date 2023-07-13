import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter Three numbers: ");
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("A is greater among all three numbers");
        }
        else if(b>a && b>c){
            System.out.println("B is the largest number.");
        }
        else{
            System.out.println("C is the second highest value in this set of values.");
        }
    }
}

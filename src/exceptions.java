// import java.io.IOException;

public class exceptions {   
    public static void main(String[] args) {
        
        try{
        int r = 180/0;
        System.out.println("result is: "+r);
        }

        catch(ArithmeticException a){
            System.err.print("Error occurred while dividing by zero");
        }
        catch(NumberFormatException b){
            System.err.println("string daal di tumne bhaiya");

        }

        // catch(IOException c){
        //     System.err.println("keybord khrab h aapka");
        // }

    }
}

public class FINALLY {
    // if there is somethinfg you relly wannt to use then the finally is used
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
        finally{
            System.out.println("\n\nfinally block executed always ");
        }
    }
}

public class breakcontinue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if (i==7){
                System.out.println("statement is in danger");
                break;
            }
            else{
                System.out.println("-- "+ i);
            }
        }
    }
}

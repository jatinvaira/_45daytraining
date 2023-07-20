class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

    public MyException(String message, Throwable cause){
        super(message,cause);

    }

}

class userdefinedexception {
    public static void main(String[] args) {
        try{
            throw new MyException("This is my custom exception");
            }catch (MyException e){
                System.out.println("Caught the Customized Exception: "+e.getMessage());
                }
                catch (Throwable t){ // Catch all other exceptions that are not of type 'CustomException'
                System.err.println("An error occurred while processing your request.");
                }
    }
}
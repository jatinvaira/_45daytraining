public class superKeyword {
    // Shows hidden var and meathod
    // super should be in the first line of method or constructor
    public static void main(String[] args) {
        Z obj=new Z();
        obj.display();  
    }    
}

class Z extends P{
    void display(){
        super.show();
        System.out.println("Java");

    }
}

class P{
    void show(){
        System.out.println("Hellow");
    }
}

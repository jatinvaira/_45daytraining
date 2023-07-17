interface TwoMethod{
    abstract public void show();
    public void disp();

}

interface OneMethod{
    abstract public void display();

}

public abstract class interface3 implements TwoMethod, OneMethod{
    public void show(){
        System.out.println("java");

    }

    public void display(){
        System.out.println("hello");
    }
    public static void main(String args[]){
        interface3 obj=new interface3() {
            public void disp(){

            }
        };
        obj.show();
        obj.display();
    }
}




// public class interface3 {
    
// }

interface top
    {
        abstract public void show();
    }
    interface bottom{
        abstract public void display();

    }
    


public class ExampleInterface implements top, bottom{
    public void show(){
        System.out.println("java");

    }
    public void display(){
        System.out.println("hello");

    }

    public static void main(String args[]){
        ExampleInterface obj=new ExampleInterface();
        obj.show();
        obj.display();
    }
}

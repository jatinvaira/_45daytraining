public class ExampleStaticVar {
    public static void main(String[] args) {
        Y obj1 = new Y();
        Y obj2 = new Y();
        obj1.setValue(2,3);
        obj1.getValue();
        
        obj2.setValue(5,6);
        obj2.getValue();

    }

    
}

class Y{
    int a;
    static int b;
    void setValue(int m, int n){
        a=m;
        b=n;

    }
    void getValue(){
        System.out.println("value of a= "+a);
        System.out.println("value of = "+b);
    }
}

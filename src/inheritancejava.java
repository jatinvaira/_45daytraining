public class inheritancejava {
    
    // single inheritance
    // a->b
    // multi level inheritance
    // a->b->c
    // multiple inhertance
    // (a,c)->b
    // java do not support directly multiple inheritance but can be used thrugh interface
    // hierarchical inheritance 
    // a->(b,c,d)
    // hibrid inheritance
    // its a tree
    // a->(b,c)->(d,e),(f,g)
    public static void main(String[] args){
        B obj = new B();
        obj.show();

        obj.display();
    }

}


class A{
    void display(){
        System.out.println("Java");

    }
}

class B extends A{

    void show(){
        System.out.println("hey");
    }
    
}
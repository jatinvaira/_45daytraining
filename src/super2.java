public class super2 {
    public static void main(String[] args) {
        B obj=new B(1,2,3);
        int r= obj.sum();
        int p=obj.add();
        System.out.println("Sum without super= "+p+" Sum with super"+r);

    }
}

class C{
    int m,n,a,b;
    C(int m, int n){
        m= a;
        n=b;

    }
    int add(){
        return(m+n);
    }

}

class B extends C{
    int m,n,o;
    B(int a, int b, int c){
        super(a, b);
        m=a;
        n=b;
        o=c;

    }

    int sum(){
        return(m+n+o);

    }
}

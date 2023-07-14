public class TwoArgumentConsttructor {
    int m,n,x,y,c;
    public TwoArgumentConsttructor(int x, int y) {
        m=x;
        n=y;

    }

    void mult(){
        int c;
        c=m*n;
        System.out.print("Product is "+c);

    }
    public static void main(String[] args) {
        TwoArgumentConsttructor obj= new TwoArgumentConsttructor(10, 20);
        obj.mult();
    }
}

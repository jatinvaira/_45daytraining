public class ConstructorOverloading
{
    void ConstructorOverloading ( int a, int b)
    {
        int c = a+b;
        System.out.println("addition is"+c);
    }
    void ConstructorOverloading (int a,int b, int c)
    {
        c =  a+b+c;
        System.out.println("addition is"+c);
    }
    public static void main(String args[])
    {
        {
            ConstructorOverloading obj= new ConstructorOverloading();
            obj.ConstructorOverloading(10,20,30);
        }
    }
    
}
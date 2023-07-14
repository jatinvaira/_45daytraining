public class ZeroArgumentConstructor {

    int a,b;
        //creating object of the MyClass with no arguments.
        public ZeroArgumentConstructor(){
            a = 2;
            b = 3;

        }

        public void add(){
            int c = a+b;
            System.out.println("Sum is: "+c);
        }



    public static void main(String[] args) {
        ZeroArgumentConstructor zac = new ZeroArgumentConstructor();
        zac.add();


    }
}

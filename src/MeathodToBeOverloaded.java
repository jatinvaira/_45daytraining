public class MeathodToBeOverloaded {
    void add(int a, int b){
        int c = a + b;
        System.out.println("Sum of " +a+  " and "+b+" is"+c);

    }

    void add(int a, int b, int c){
        int d = a+ b+ c;
        System.out.println("The sum of three numbers are: "+d );
    }

    // overloading it an property of polymprphism and it is called compile time overloading
    // compile time and runtime overloading
    // meathodd overloading and constructor overloading
    // rules
    // number of arguments  in overloaded meathod should be different
    // datatype of argument should be different 
    // public static void main (String[] args) {
    //     MeathodToBeOverloaded obj= new MeathodToBeOverloaded();
    //     obj.add(10, 20);
    //     obj.add(10, 20, 30);
    // }
}

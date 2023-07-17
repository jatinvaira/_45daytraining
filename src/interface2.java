interface ParentX {
    void add();

}

interface y extends ParentX {
    void sub();
}

public class interface2 implements y {
    public void add() {
        int a = 2, b = 3;
        System.out.println("sum" + (a + b));

    }

    public void sub() {
        int a = 8, b = 3;
        System.out.println("difference" + (a - b));

    }

    public static void main(String[] args) {
        interface2 obj = new interface2();
        obj.add();
        obj.sub();

    }
}

// public class interface2 {

// }

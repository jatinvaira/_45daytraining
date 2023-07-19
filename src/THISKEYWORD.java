public class THISKEYWORD {
    // it points the current object
    public static void main(String[] args) {
        Addition obj = new Addition(10, 20);
        obj.add();
        obj.display();
    }

}

class Addition {
    int a, b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;

    }

    void add() {
        int c = a + b;
        System.out.println("sum is: " + c);
        // this.show();

    }

    void display() {
        System.out.println("Hello");
        this.show();

    }

    void show() {
        System.out.println("java");
    }
}

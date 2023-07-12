// Input using DataInputStream (parsing is needed)


import java.io.*;

public class Mdd {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("enter Length & breadth ");
            int a = Integer.parseInt(dis.readLine());
            int b = Integer.parseInt(dis.readLine());
            int c = a * b;
            System.out.println("Area= " + c);
        } catch (Exception e) {

            System.out.print(e.getMessage());
        }

    }
}
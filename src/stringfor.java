public class stringfor {
    public static void main(String[] args) {
        String s1 = "Urvashi";
        String s2 = "Urvashi";
        String s3 = new String("Urvashi");
        String s4 = new String("Urvashi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }

}

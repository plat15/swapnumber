public class Main {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double temp = 0;

        System.out.println("============================================");
        System.out.println("Before swapping : a, b = " + a + " , " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + " , " + b);
        System.out.println("============================================");

    }
}
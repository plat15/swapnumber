public class Swapnumber {
    public static void main(String[] args) {
        Swapnumber swapnumber = new Swapnumber();
        swapnumber.swap(5, 10);
    }

    public void swap(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

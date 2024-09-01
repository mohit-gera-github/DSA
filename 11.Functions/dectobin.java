public class dectobin {
    public static void dectobin(int n) {
        int mynum = n;
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (int) (rem * Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("dec to bin of " + mynum + " is " + bin );
    }

    public static void main(String args[]) {
        dectobin(10);

    }

}

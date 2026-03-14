public class oddoreven {
    public static void main (String args []) {
    findOddOrEven(9);
    findOddOrEven(1);
    findOddOrEven(2);
    }
    public static int findOddOrEven(int n) {
        int bitmask = 1;
        if ((n & bitmask)  == 1) {
            System.out.println("number is odd");
        }
        else {
            System.out.println("number is even");
        }
        return n;
    }
}

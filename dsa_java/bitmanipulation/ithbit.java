public class ithbit {
    public static void main (String args []) {
        System.out.println(findIthbit(15, 2));
    }
    public static int findIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((bitmask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

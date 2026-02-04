public class largest {
    public static void main(String args[]) {
        int arr [] = {1,20,3,4,5} ;
        System.out.println(large(arr));
    }
    public static int large(int arr []) {
        int largestno = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largestno < arr[i]) {
                largestno = arr[i];
            }
        }
        return largestno;
    }
}
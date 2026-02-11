public class maxsubsumprefix {
    public static void main (String args []) {
        int arr[] = {2, 4, 6, 8, 10};
        prefix(arr);
    }
    public static void prefix(int arr[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
         int prefix [] = new int[arr.length];
        for (int i = 1; i < prefix.length; i++) {
            prefix[0] = arr[0];
            prefix[i] = prefix [i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j =+ i; j < arr.length; j++){
                int end = j;
                 cursum = start == 0 ? prefix[end] : prefix [start - 1];
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }
        }
        System.out.println("max sum is : " + maxsum);
    }
}

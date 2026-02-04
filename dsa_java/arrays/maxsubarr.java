public class maxsubarr {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        maxsub(arr);
    }
    public static void maxsub(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i= 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += arr[k];
                }
                System.out.println(currsum);
                 if(maxsum < currsum) {
                maxsum = currsum;
             }
           }
        }
         System.out.println("max is " + maxsum);
    }
}
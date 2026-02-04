public class pair {
    public static void main (String args []) {
        int arr [] = {1,2,3,4,5};
        pairarr(arr);
    }
    public static void pairarr(int arr[]) {
        int tp = 0;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
             curr = arr[i];
        for (int j = i + 1; j < arr.length; j++) {
            System.out.print( " ( " + curr + arr[j] + ") ");
            tp ++;
        }
         System.out.println();
      }
      System.out.println("total pairs are: " + tp);
    }
}
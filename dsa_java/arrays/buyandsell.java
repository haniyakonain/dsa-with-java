public class buyandsell {
    public static void main (String args []) {
        int arr [] = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks(arr));
    }
    public static int buyandsellstocks(int arr[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buyprice < arr[i]) {
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else {
                buyprice = arr[i];
            }
        }
        return maxprofit;
    }
}

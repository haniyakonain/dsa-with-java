public class insertion {
    public static void main (String args[]) {
        int arr[] = {1, 3, 5, 6, 7};
        insertionsort(arr);
        for (int i = 0 ; i < arr.length  ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionsort(int arr[]) {
        for (int i= 0; i < arr.length - 1 ; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1]  = arr[prev];
                prev --;
            } 
            arr[prev + 1] = curr;
        }
    }
}

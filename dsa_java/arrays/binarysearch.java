public class binarysearch {
    public static void main(String args []) {
        int arr[] = {1,2,3,4,5};
        int key = 3;
        int index = bs(arr, key);
        if (index == -1) {
            System.out.println("key not found");
        } else {
        System.out.println("key found at index: " + index);
        }
    }
    public static int bs(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end ) {
            int mid =  (start + end ) / 2;
            if (arr[mid] == key ) {
                return mid;
            }
            if (arr[mid] < key) {
             start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
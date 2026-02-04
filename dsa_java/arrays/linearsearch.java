public class linearsearch {
    public static void main (String args [])  {
        int arr [] = { 1,2,3,4,5 };
        int key = 3;
        int index = ls(arr, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at " + index);
        }
    }
    public static int ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
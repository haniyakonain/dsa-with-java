package arrays;
public class refer {

 public static void reference(int arr[]) {
  for(int i = 0; i <arr.length; i++) {
     arr[i] = arr[i] + 1;
  }
 }


    public static void main (String args[]) {
    int arr[] = {1,2,3};
    reference(arr);
    for(int i=0; i <arr.length; i++) {
    System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

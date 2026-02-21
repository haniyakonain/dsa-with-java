import java.util.*;
public class createandsearch {
    public static void main(String args []) {
        int matrix[][] = new int [3][2];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n ; i++) {
            for(int j=0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    for (int i= 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();

    }
    find(matrix, 4);
}
public static boolean find (int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
        for(int j =0; j < matrix[0].length; j++) {
            if (matrix [i][j] == key) {
                System.out.print("found at cell" + "(" + i + "," + j + ")");
                return true;
            }
        }
    }
    System.out.println("not found");
   return false;
}
}

package leetcode;

public class buzzfuzz {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        for(int i = 1; i <= arr.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {  
                System.out.println("buzzfuzz");
            } else if (i % 3 == 0) {
                System.out.println("buzz");
            } else if (i % 5 == 0) {       
                System.out.println("fuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}


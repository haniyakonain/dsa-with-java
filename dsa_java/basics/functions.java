package basics;
public class functions {
    public static void main (String args []) {
     /*try (Scanner sc = new Scanner(System.in); ) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calsum(a , b);
        System.out.println("sum is: " + sum);
     }
    }
public static int calsum(int a, int b) {
    int sum = a + b ;
    return sum;*/
    // call by reference
    int a = 2;
    int b = 20;
    call(a,b);
    System.out.println(" a is: " + a);
    System.out.println(" b is: " + b);
     
}
public static void call(int a, int b){ // all functions in java are not given original value but its copy 
    int temp = a;
     a = b;
     b = temp;
    }
}
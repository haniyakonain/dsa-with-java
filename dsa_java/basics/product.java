package basics;
public class product { 
   /* public static void main (String args []) {
        int a = 5;
        int b = 2;
        int prod = mul(a,b);
        System.out.println("product is: " + prod);
    }
 public static int mul(int a, int b) {
  int mul = a * b;
  return mul;


 } */
  // to find factorial
 public static int fact(int n) {
    int f = 1;
    for (int i=1; i <= n; i++){
    f = n * i;
    }
    return f;
 }
 //to find binomial coefficient
 // using helper functions
 public static int bincoeff(int n , int r){
    int n_fact = fact(n);
    int r_fact = fact (r);
    int nmr_fact = fact (n-r);
    int bincoeff = n_fact /  (r_fact * nmr_fact );
    return bincoeff;
 }
 /*  function overloading
 same name diff parameters like 
 diff number of params
 public static int sum(int a, int b){
    int sum = a + b;
    return sum;
 }
 public static int sum(int a, int b, int c){
    int sum = a + b + c;
    return sum;
 }
 //same type of params
 public static int sum(int a, int b){
    int sum = a + b;
    return sum;
 }
 public static float sum(float a, float b){
    float sum = a + b;
    return sum;
 }*/

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for ( int i = 2; i <= Math.sqrt(n); i++ ) {
            if (n % i == 0) {
               return false;
            }
        }
        return true;
    }

public static void primeinrange(int n) {
    for (int i = 2; i <= n-1; i++) {
    if (isprime(i)) {
        System.out.print(i + " ");
    }
  }
}

public static void binToDec (int n) {
   int bin = n;
   int pow = 0;
   int dec = 0;
   while (n > 0) {
     int lastdigit = n % 10 ;
      dec = dec + (lastdigit * (int)Math.pow(2, pow));
      pow++;
      n /= 10;

   }
   System.out.print("the decimal of " + bin + " is: " + dec );
}

 public static void main (String args[]) {
binToDec(101 );
}   
}

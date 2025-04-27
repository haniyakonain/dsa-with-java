package basics;
public class reverse_num {
    public static void main (String [] args) {
     int num = 12345;
     while (num > 0) {
        int lastdigit = num % 10; // so we get last digit
        System.out.print(lastdigit);
        num /= 10; // so we can remove it
     }
     System.out.println();
    }
}

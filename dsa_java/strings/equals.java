public class equals {
    public static void main (String args []) {
        String str1 = "hi";
        String str2 = "hi";
        String str3 = new String("hi");
        if (str1 == str2) {
            System.out.println("are equal");
        }
        else {
            System.out.println("not ");
        }
        // if (str1 == str3) { // == checks object level 
        //     System.out.println("equal");
        // }
        // else {
        //     System.out.println("not equal");
        // }
        if (str1.equals(str3)) {
            System.out.println("are equal"); // equal because it checks value
        }
        else {
            System.out.println("not equal");
        }
    }
}

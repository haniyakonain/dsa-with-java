import java.util.*;
public class create {
    public static void main(String args[]) {
        String str = "im string ";
        String str2 = "hi";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + " " + str + " " + str2 ); // concatination
        charatcheck(str);
}
public static void charatcheck(String str) {
    for (int i=0; i < str.length(); i++){
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
}
}
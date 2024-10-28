package hashmap;

import java.util.*;
 class hashset{
public static void main (String args[]) {
    HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(10); // won't add duplicate
if(set.contains(10)) {
    System.out.println(10 + " found in the set!");
 }
    set.remove(10);
    System.out.println("Size: " + set.size());
    System.out.println("Set: " + set);
  
 set.add(1);
set.add(2);
set.add(3);
 Iterator it = set.iterator();
 while(it.hasNext())
  System.out.print(it.next() + " ");
}
}
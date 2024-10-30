<h1>dsa with java </h1>
<h2>about java <br></h2>
Object-oriented<br>
Portable<br>
Robust<br>
Secure<br>
Multithreaded<br>
Interpreted<br>
High-performance<br>
Distributed<br>
Dynamic<br>
Platform-independent<br><br>

## ARRAYS
non premetive data type<br>
a data structure in general<br>
collection of items (elements) <br>
contiguous memory locations<br>
accessed using an index or position number<br>
2 types that is static and dynamic <br>
but in java we dont have dynamic array,
<br> we have ArrayList class from the java.util package,
<br> which functions as a dynamic array<br>
Memory=Size×Data Type<br>

<h3>Common Operations<br></h3>
Getting Length: <br>
Use .length to get the size of the array.<br>
int length = numbers.length; <br>

<h3>Looping Through an Array:<br></h3>
for (int i = 0; i < numbers.length; i++){ <br>
    System.out.println(numbers[i]);<br>
}<br>

<h3>Static arrays<br></h3>
Compile time<br>
Stack<br>
Fixed size<br>
Size is set at creation<br>
Direct index-based access<br>
Contiguous memory<br>
<h3>Static Array Syntax<br></h3>
// Syntax for declaring and initializing a static array<br>
type[] arrayName = new type[size];<br>
<h3>Example:<br></h3>
int[] staticArray = new int[5];<br>
// A static array of integers with size 5<br>

<h3>Dynamic arrays<br></h3>
Resizable<br>
Can grow or shrink<br>
Run time <br>
Heap<br>
May use more memory than static arrays (due to resizing)<br>
Direct index-based access<br>
Contiguous memory<br>
<h3>Dynamic Array Syntax<br></h3>
// Importing ArrayList class<br>
import java.util.ArrayList;<br>
// Syntax for declaring and initializing a dynamic array<br>
ArrayList<type> arrayName = new ArrayList<>();<br>
<h3>Example:<br></h3>
ArrayList<Integer> dynamicArray = new ArrayList<>();<br>
// A dynamic array of integers<br>
dynamicArray.add(10);  // Adding elements dynamically<br>
dynamicArray.add(20);<br>

<h3>2D array<br></h3>
an array of arrays<br>
grid or matrix format<br>
Memory=Rows×Columns×Data Type Size+Overhead<br>
overhead refers to the extra memory<br>
<h3>Declaring a 2D Array<br></h3>
type[][] arrayName;<br>
<h3>Initializing a 2D Array<br></h3>
int[][] matrix = {<br>
    {1, 2, 3},<br>
    {4, 5, 6},<br>
    {7, 8, 9}<br>
};<br>
<h3>Declaration and Initialization in Separate Steps<br></h3>
int[][] matrix = new int[1][1]; <br>
// Initializing elements<br>
matrix[0][0] = 1;<br>

<h3>operations on arrays</h3><br>

<h4>Insert: </h4><br>
Add an element at a specified position in the array.<br>
<h4>Delete:</h4><br>
Remove an element from a specific position in the array.<br>
<h4>Search:</h4><br>
Find the position of a specific element within the array.<br>
<h4>Sort:</h4><br>
Arrange the elements of the array in a specific order (ascending or descending)<br>
<h4>Merge:</h4><br>
Combine two or more arrays into a single array.<br>
<h4>Split:</h4><br>
Divide an array into two or more smaller arrays.<br>
<h4>Traverse:</h4><br>
Visit each element of the array, typically for processing or displaying.<br>
<h4>Reverse:</h4><br>
Change the order of elements in the array to the opposite sequence.<br>
<h4>Map:</h4><br>
Apply a function to each element of the array, creating a new array with the results.<br>
<h4>Filter:</h4><br>
Create a new array containing only elements that meet a specified condition.<br>
<h4>Reduce:</h4><br>
Combine all elements of the array into a single value using a specified function.<br>
<h4>Concat:</h4><br>
Join two or more arrays together to form a single array.<br>
<h4>Slice:</h4><br>
Extract a portion of the array, creating a new array from a specified range.<br>
<h4>Initialize:</h4><br>
Set the initial values of the array elements upon creation.<br>
<h4>Access:</h4><br>
Retrieve the value of an element at a specified index in the array.<br>

<h3>Time complexity<br></h3>
<h4>Insertions:</h4> O(n)<br>
<h4>Deletions: </h4>O(n)<br>
<h4>Searches: </h4>O(n) (or O(log n) for binary search in sorted arrays)<br>

## HASHSET<br><br>

unique values<br>
doesn't allow duplicates<br>
not ordered (elements are not stored in insertion order)<br>
allows null value<br>
time complexity<br>
insert,search,delete - O(1)<br>

<h3>syntax-<br></h3>
HashSet<DataType> setName = new HashSet<>();<br>
Can't use primitive types directly (use wrapper classes instead)<br>
Use Integer instead of int<br>
Use Double instead of double<br>

<h3>Create</h3><br>
HashSet<Integer> set = new HashSet<>();<br>

<h3>Insert “add” to insert value</h3><br>
set.add(10);<br>
set.add(20);<br>
set.add(10); // won't add duplicate<br>

<h3>for search we use “contains” that returns true if value exists <br>
and false if it doesnt</h3><br>
if(numbers.contains(num)) {<br>
System.out.println(num + " found in the set!");<br>

<h3>to delete we use “remove”</h3><br>
 set.remove(10);<br>

<h3>size</h3>br>
System.out.println("Size: " + set.size());<br>

<h3>Print all elements</h3><br>
// Method 1: Direct print<br>
System.out.println("Set: " + set);<br>
// Set: [20, 10, 30]<br>

//  Method 2: For each loop<br>
System.out.print("Elements: ");<br>
       for(int num : set) {<br>
           System.out.print(num + " ");<br>
// Elements: 20 10 30<br>

 <h3>iterator</h3><br>
it is a method<br>
iterator because no index of set<br>
Iterator it = set.iterator();<br>
while(it.hasNext())<br>
System.out.print(it.next() + " ");<br>
<h3>hasNext()</h3> <br>
checks if more elements exist<br>
<h3>next()</h3>
gets next element<br>
<h3>remove() </h3> <br>
removes current element<br>
<h3>example</h3><br>
it → null → 1 → 2 → 3<br>
   it.next() will give 1 then 2 then 3<br>
   it.hasnext() will return true or false so true, true, true, false<br>

  ## HASHMAP<br><br>
stores pairs<br>
keys and values<br>
keys should be unique, value may or may not be unique<br>
not ordered (elements are not stored in insertion order)<br>

<h3>create<br></h3>
syntax-<br>
HashMap<Key DataType, Value DataType> mapName = new HashMap<>();<br>

<h3> insert<br></h3>
2 cases<br>
1. exist - update<br>
2. does not exists - insert new pair<br>

<h3> Insert “put” to insert value<br></h3>
set.put("India", 10);<br>
set.put("China", 20);<br>
set.put("US", 10);<br>

<h3>Updating value<br></h3>
set.put("US", 40);<br>

<h3>search / lookup<br></h3>
.put<br>
checks if a particular key exists within the HashMap<br>
map.put("Apple", 10);<br>
if (map.containsKey("Apple")) {<br>
System.out.println("Apple is in the map with quantity: " + map.get("Apple"));<br>
} else {<br>
System.out.println("Apple is not in the map.");<br>
}<br>
Output<br>
Apple is in the map with quantity: 10<br>

<h3> .get<br></h3>
retrieves the value associated with a specified key<br>
1. key exists in the map  corresponding value;<br>
2. key doesn’t exist - null<br>

<h3>To iterate , there are several common methods<br></h3>

<h4>1. Iterating Over Entry Set (Recommended for both keys and values)</h4><br>
Using the entrySet method provides access to both the keys and values in each iteration<br>
import java.util.HashMap;<br>
import java.util.Map;<br>
public class HashMapIterationExample {<br>
    public static void main(String[] args) {<br>
        HashMap<String, Integer> map = new HashMap<>();<br>
        map.put("Apple", 10);<br>
        map.put("Banana", 15);<br>
        map.put("Orange", 20);<br>
        // Using entrySet to iterate over keys and values<br>
        for (Map.Entry<String, Integer> entry : map.entrySet()) {<br>
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());<br>
        }<br>
    }<br>
}<br>

<h4>2. Iterating Over Keys Only<br></h4>
If you need only the keys, you can use the keySet method<br>
for (String key : map.keySet()) {<br>
    System.out.println("Key: " + key);<br>
}<br>

<h4>3. Iterating Over Values Only<br></h4>
If you’re only interested in values, use the values method<br>
for (Integer value : map.values()) {<br>
    System.out.println("Value: " + value);<br>
}<br>

<h4> 4. Using forEach with Lambda (Java 8 and above)<br></h4>
Java 8 introduced the forEach method in Map, which allows you to iterate using lambda expressions<br>
map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));<br>

/h4>5. Using an Iterator<br></h4>
You can also use an Iterator with entrySet to iterate over key-value pairs<br> This method is useful if you need to modify the map during iteration<br>
import java.util.Iterator;<br>
Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();<br>
while (iterator.hasNext()) {<br>
    Map.Entry<String, Integer> entry = iterator.next();<br>
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());<br>
}<br>

<h3>remove<br></h3>
//syntax- mapName.remove(”key”);<br>
map.remove(”US”);<br>
so value will also be deleted<br>

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

<h2>ARRAYS</h2>
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
for (int i = 0; i < numbers.length; i++) {<br>
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

operations on arrays<br>

Insert: Add an element at a specified position in the array.<br>
Delete: Remove an element from a specific position in the array.<br>
Search: Find the position of a specific element within the array.<br>
Sort: Arrange the elements of the array in a specific order (ascending or descending)<br>
Merge: Combine two or more arrays into a single array.<br>
Split: Divide an array into two or more smaller arrays.<br>
Traverse: Visit each element of the array, typically for processing or displaying.<br>
Reverse: Change the order of elements in the array to the opposite sequence.<br>
Map: Apply a function to each element of the array, creating a new array with the results.<br>
Filter: Create a new array containing only elements that meet a specified condition.<br>
Reduce: Combine all elements of the array into a single value using a specified function.<br>
Concat: Join two or more arrays together to form a single array.<br>
Slice: Extract a portion of the array, creating a new array from a specified range.<br>
Initialize: Set the initial values of the array elements upon creation.<br>
Access: Retrieve the value of an element at a specified index in the array.<br>

Time complexity<br>

Insertions: O(n)<br>
Deletions: O(n)<br>
Searches: O(n) (or O(log n) for binary search in sorted arrays)<br>

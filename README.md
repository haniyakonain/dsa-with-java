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

<h3>Common Operations</h3>
Getting Length: <br>
Use .length to get the size of the array.<br>
int length = numbers.length; <br>

<h3>Looping Through an Array:</h3>
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
<h3>Static Array Syntax</h3>
// Syntax for declaring and initializing a static array<br>
type[] arrayName = new type[size];<br>
<h3>Example:</h3>
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
<h3>Dynamic Array Syntax</h3>
// Importing ArrayList class<br>
import java.util.ArrayList;<br>
// Syntax for declaring and initializing a dynamic array<br>
ArrayList<type> arrayName = new ArrayList<>();<br>
<h3>Example:</h3>
ArrayList<Integer> dynamicArray = new ArrayList<>();<br>
// A dynamic array of integers<br>
dynamicArray.add(10);  // Adding elements dynamically<br>
dynamicArray.add(20);<br>

<h3>2D array</h3>
an array of arrays<br>
grid or matrix format<br>
Memory=Rows×Columns×Data Type Size+Overhead<br>
overhead refers to the extra memory<br>
<h3>Declaring a 2D Array</h3>
type[][] arrayName;<br>
<h3>Initializing a 2D Array</h3>
int[][] matrix = {<br>
    {1, 2, 3},<br>
    {4, 5, 6},<br>
    {7, 8, 9}<br>
};<br>
<h3>Declaration and Initialization in Separate Steps<br></h3>
int[][] matrix = new int[1][1]; <br>
// Initializing elements<br>
matrix[0][0] = 1;<br>

<h3>operations on arrays</h3>
<h4>Insert: </h4>
Add an element at a specified position in the array.<br>
<h4>Delete:</h4>
Remove an element from a specific position in the array.<br>
<h4>Search:</h4>
Find the position of a specific element within the array.<br>
<h4>Sort:</h4>
Arrange the elements of the array in a specific order (ascending or descending)<br>
<h4>Merge:</h4>
Combine two or more arrays into a single array.<br>
<h4>Split:</h4>
Divide an array into two or more smaller arrays.<br>
<h4>Traverse:</h4>
Visit each element of the array, typically for processing or displaying.<br>
<h4>Reverse:</h4>
Change the order of elements in the array to the opposite sequence.<br>
<h4>Map:</h4>
Apply a function to each element of the array, creating a new array with the results.<br>
<h4>Filter:</h4>
Create a new array containing only elements that meet a specified condition.<br>
<h4>Reduce:</h4>
Combine all elements of the array into a single value using a specified function.<br>
<h4>Concat:</h4>
Join two or more arrays together to form a single array.<br>
<h4>Slice:</h4>
Extract a portion of the array, creating a new array from a specified range.<br>
<h4>Initialize:</h4>
Set the initial values of the array elements upon creation.<br>
<h4>Access:</h4>
Retrieve the value of an element at a specified index in the array.<br><br>

<h3>Time complexity</h3>
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

<h3>syntax-</h3>
HashSet<DataType> setName = new HashSet<>();<br>
Can't use primitive types directly (use wrapper classes instead)<br>
Use Integer instead of int<br>
Use Double instead of double<br>

<h3>Create</h3>
HashSet<Integer> set = new HashSet<>();<br>

<h3>Insert “add” to insert value</h3>
set.add(10);<br>
set.add(20);<br>
set.add(10); // won't add duplicate<br>

<h3>for search we use “contains” that returns true if value exists <br>
and false if it doesnt</h3>
if(numbers.contains(num)) {<br>
System.out.println(num + " found in the set!");<br>

<h3>to delete we use “remove”</h3>
 set.remove(10);<br>

<h3>size</h3>
System.out.println("Size: " + set.size());<br>

<h3>Print all elements</h3>
// Method 1: Direct print<br>
System.out.println("Set: " + set);<br>
// Set: [20, 10, 30]<br>

//  Method 2: For each loop<br>
System.out.print("Elements: ");<br>
       for(int num : set) {<br>
           System.out.print(num + " ");<br>
// Elements: 20 10 30<br>

 <h3>iterator</h3>
it is a method<br>
iterator because no index of set<br>
Iterator it = set.iterator();<br>
while(it.hasNext())<br>
System.out.print(it.next() + " ");<br>
<h3>hasNext()</h3>
checks if more elements exist<br>
<h3>next()</h3>
gets next element<br>
<h3>remove() </h3>
removes current element<br>
<h3>example</h3>
it → null → 1 → 2 → 3<br>
   it.next() will give 1 then 2 then 3<br>
   it.hasnext() will return true or false so true, true, true, false<br>

  ## HASHMAP<br><br>
stores pairs<br>
keys and values<br>
keys should be unique, value may or may not be unique<br>
not ordered (elements are not stored in insertion order)<br>

<h3>create</h3>
syntax-<br>
HashMap<Key DataType, Value DataType> mapName = new HashMap<>();<br>

<h3> insert</h3>
2 cases<br>
1. exist - update<br>
2. does not exists - insert new pair<br>

<h3> Insert “put” to insert value</h3>
set.put("India", 10);<br>
set.put("China", 20);<br>
set.put("US", 10);<br>

<h3>Updating value</h3>
set.put("US", 40);<br>

<h3>search / lookup</h3>
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

<h3> .get</h3>
retrieves the value associated with a specified key<br>
1. key exists in the map  corresponding value;<br>
2. key doesn’t exist - null<br>

<h3>To iterate , there are several common methods</h3>

<h4>1. Iterating Over Entry Set (Recommended for both keys and values)</h4>
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

<h4>2. Iterating Over Keys Only</h4>
If you need only the keys, you can use the keySet method<br>
for (String key : map.keySet()) {<br>
    System.out.println("Key: " + key);<br>
}<br>

<h4>3. Iterating Over Values Only</h4>
If you’re only interested in values, use the values method<br>
for (Integer value : map.values()) {<br>
    System.out.println("Value: " + value);<br>
}<br>

<h4> 4. Using forEach with Lambda (Java 8 and above)</h4>
Java 8 introduced the forEach method in Map, which allows you to iterate using lambda expressions<br>
map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));<br>

<h4> 5. Using an Iterator</h4>
You can also use an Iterator with entrySet to iterate over key-value pairs<br> This method is useful if you need to modify the map during iteration<br>
import java.util.Iterator;<br>
Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();<br>
while (iterator.hasNext()) {<br>
    Map.Entry<String, Integer> entry = iterator.next();<br>
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());<br>
}<br>

<h3>remove</h3>
//syntax- mapName.remove(”key”);<br>
map.remove(”US”);<br>
so value will also be deleted<br><br>

Put( )<br>
Exist-update<br>
Not exist- new key value<br>
Get( )<br>
Exist- gives value<br>
Not exist- null<br>
Contains( )<br>
Exist- true<br>
Not exist- False<br>
Remove( )<br>
Exist- remove<br>
Not exist- null<br>
Size( )<br>
Keyset( )<br>

<h3>Hashmap implementation</h3> 
Array of linked list<br>
We have array index and data index starting from 0 <br>
Index is called bucket in hashmap <br>
Last value is null<br>
n (node) <br>
N (array_size)<br>

<h3>Hashing</h3>
Changing data format <br>
Ex- companies use it to save password<br>

Input -> hash function (Hash code) -> output<br>       
Key -> hash function (Hash code)-> bucket<br> index (o to n-1)<br>

Linked list size is lambda<br>
O( linked list ) to put<br>
n/N lambda<br>
Lamda is constant value<br>
Lamda <= k<br>
K is constant or threshold value<br>
If Lamda increases we use<br> rehashing to decrease it than k value<br> 
So we double the N (array_size) value<br>
Bucket index might change<br>
Worst case - O(n)<br>
Average case - O(lambda)<br>
Best case - O(1)<br>


<h1>Algorithm</h1>
Data Structures and Algorithms (DSA) is a fundamental topic in computer science that focuses on organizing, managing, and processing data efficiently. It's essential for solving problems effectively and is often a key part of technical interviews for software engineering roles.

---

## **1. What Are Data Structures?**
A **data structure** is a way to organize and store data so it can be accessed and modified efficiently. Each data structure has unique properties, operations, and use cases.

### **Types of Data Structures**
1. **Linear Data Structures**: Data elements are arranged in a sequential manner.
   - **Array**: A collection of elements stored at contiguous memory locations.
     - Example: `[1, 2, 3, 4, 5]`
     - Operations: Access, insert, delete.
   - **Linked List**: A sequence of nodes where each node points to the next.
     - Types: Singly linked list, doubly linked list, circular linked list.
   - **Stack**: A Last In First Out (LIFO) data structure.
     - Operations: Push, pop, peek.
   - **Queue**: A First In First Out (FIFO) data structure.
     - Variants: Circular queue, priority queue, deque (double-ended queue).

2. **Non-Linear Data Structures**: Data elements are organized hierarchically.
   - **Trees**: A hierarchical data structure with a root node and child nodes.
     - Binary Tree, Binary Search Tree (BST), AVL Tree, B-Trees, etc.
   - **Graphs**: A set of nodes (vertices) connected by edges.
     - Types: Directed, undirected, weighted, unweighted.

3. **Hashing**: Maps keys to values using hash functions.
   - Example: HashMap, HashSet.
   - Applications: Caching, indexing.

4. **Other Advanced Data Structures**:
   - Heap: Min-heap and max-heap for priority-based operations.
   - Trie: A prefix tree used for efficient string searches.
   - Disjoint Set (Union-Find): Used in graph algorithms like Kruskal’s.

---

## **2. What Are Algorithms?**
An **algorithm** is a step-by-step procedure to solve a specific problem. 

### **Types of Algorithms**
1. **Sorting Algorithms**:
   - Bubble Sort, Selection Sort, Insertion Sort.
   - Quick Sort, Merge Sort, Heap Sort (efficient for large datasets).
   - Radix Sort, Counting Sort (non-comparison-based).

2. **Searching Algorithms**:
   - Linear Search: Sequential search in an array.
   - Binary Search: Efficient search in sorted arrays.

3. **Recursion**:
   - Breaking a problem into smaller sub-problems.
   - Example: Factorial, Fibonacci sequence.

4. **Divide and Conquer**:
   - Divide the problem, solve sub-problems, and combine.
   - Example: Merge Sort, Quick Sort.

5. **Dynamic Programming (DP)**:
   - Solving problems by breaking them into overlapping sub-problems.
   - Example: Fibonacci series, 0/1 Knapsack, Longest Common Subsequence.

6. **Greedy Algorithms**:
   - Solve problems by choosing the best local option at each step.
   - Example: Kruskal’s Algorithm, Prim’s Algorithm.

7. **Backtracking**:
   - Try all possibilities and backtrack if the current solution is not valid.
   - Example: N-Queens problem, Sudoku solver.

8. **Graph Algorithms**:
   - Depth First Search (DFS), Breadth First Search (BFS).
   - Dijkstra’s Algorithm (shortest path), Kruskal’s/Prim’s (minimum spanning tree).
   - Topological Sort, Bellman-Ford, Floyd-Warshall.

9. **String Algorithms**:
   - Pattern matching: KMP Algorithm, Rabin-Karp.
   - Z Algorithm, Suffix Trees/Arrays.

10. **Bit Manipulation**:
    - Perform operations at the bit level.
    - Example: XOR for finding the unique element.

---

## **3. Importance of DSA**
- **Efficient Problem Solving**: Helps in solving complex problems efficiently.
- **Optimized Code**: Reduces time and space complexity.
- **Crucial for Interviews**: Most technical interviews test DSA concepts.
- **Real-world Applications**:
  - Navigation systems (graph algorithms).
  - Database indexing (trees, hashing).
  - Network routing (shortest path algorithms).

---

## **4. Complexity Analysis**
Understanding the performance of an algorithm is critical.

- **Time Complexity**: Measures how the running time increases with input size.
  - Common notations: O(1), O(log N), O(N), O(N log N), O(N²), etc.
- **Space Complexity**: Measures the amount of memory used by an algorithm.

---

## **5. Key Topics for Interviews**
1. Arrays and Strings:
   - Problems: Two Sum, Maximum Subarray, Sliding Window problems.
2. Linked Lists:
   - Problems: Reverse a Linked List, Detect Cycle in a Linked List.
3. Trees:
   - Problems: Binary Tree Traversals (inorder, preorder, postorder), Lowest Common Ancestor.
4. Graphs:
   - Problems: Connected Components, Cycle Detection, Shortest Path.
5. Dynamic Programming:
   - Problems: Longest Increasing Subsequence, Matrix Chain Multiplication.
6. Recursion and Backtracking:
   - Problems: Subsets, Permutations, N-Queens.
7. Sorting and Searching:
   - Problems: Merge Intervals, Binary Search Variants.
8. Stacks and Queues:
   - Problems: Valid Parentheses, Next Greater Element.

---


### **Online Platforms**:
- **LeetCode**: Best for interview preparation.
- **HackerRank**: For learning and practicing coding.
- **GeeksforGeeks**: Tutorials and practice problems.
- **Codeforces** and **CodeChef**: Competitive programming.

### **Courses**:
- *Coursera*: Algorithms Specialization by Stanford University.
- *Udemy*: Master the Coding Interview by Colt Steele.
- *freeCodeCamp*: Free tutorials on DSA.

---

## **7. Tips for Mastering DSA**
1. **Start with Basics**: Understand arrays, strings, and linked lists first.
2. **Practice Regularly**: Solve problems daily on platforms like LeetCode.
3. **Learn Complexity**: Always analyze the time and space complexity.
4. **Implement From Scratch**: Write your own implementations of data structures and algorithms.
5. **Focus on Patterns**: Recognize patterns in problems (e.g., sliding window, divide-and-conquer).
6. **Mock Interviews**: Simulate coding interviews to build confidence.

---

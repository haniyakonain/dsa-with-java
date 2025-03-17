# DSA with Java

## About Java
- **Object-Oriented**
- **Portable**
- **Robust**
- **Secure**
- **Multithreaded**
- **Interpreted**
- **High-Performance**
- **Distributed**
- **Dynamic**
- **Platform-Independent**

---

# Arrays in Java
### What are Arrays?
- Non-primitive data type
- A data structure in general
- Collection of items (elements)
- Linear memory allocation
- Stored in **contiguous memory locations**
- Accessed using an **index or position number**
- Two types: **Static and Dynamic**
- Java does not support dynamic arrays directly, but it provides **ArrayList** from `java.util` package

### Memory Calculation:
```
Memory = Size × Data Type
```

### Declaring an Array:
```java
int[] numbers = {1, 2, 3};
```

### Accessing Array Length:
```java
int length = numbers.length;
```

### Looping Through an Array:
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

## Static Arrays
- **Compile-time allocation**
- Stored in **stack**
- **Fixed size** at creation
- **Direct index-based access**

### Syntax:
```java
int[] staticArray = new int[5];
```

## Dynamic Arrays (ArrayList)
- **Resizable** (can grow/shrink)
- Stored in **heap memory**
- Uses more memory due to resizing

### Syntax:
```java
import java.util.ArrayList;
ArrayList<Integer> dynamicArray = new ArrayList<>();
dynamicArray.add(10);
dynamicArray.add(20);
```

## 2D Arrays
- An array of arrays (Matrix format)
- Used for grid-based data storage

### Declaring a 2D Array:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Operations on Arrays
- **Insert:** Add an element at a specific position
- **Delete:** Remove an element
- **Search:** Find an element’s position
- **Sort:** Arrange elements in order
- **Merge:** Combine multiple arrays
- **Split:** Divide an array
- **Traverse:** Access all elements
- **Reverse:** Change order

### Time Complexity
| Operation   | Complexity |
|------------|------------|
| Insertion  | O(n)       |
| Deletion   | O(n)       |
| Search     | O(n) or O(log n) (Binary Search) |

---

# HashSet in Java
- **Stores unique values** (No duplicates)
- **Unordered collection** (No indexing)
- **Allows null values**

### Time Complexity
| Operation  | Complexity |
|-----------|------------|
| Insert    | O(1)       |
| Search    | O(1)       |
| Delete    | O(1)       |

### Syntax:
```java
HashSet<Integer> set = new HashSet<>();
```

### Operations
```java
set.add(10);  // Insert
set.add(20);
set.remove(10);  // Delete
System.out.println(set.contains(20));  // Search
```

### Iterating Through HashSet:
```java
for (int num : set) {
    System.out.print(num + " ");
}
```

---

# HashMap in Java
- **Key-Value pair storage**
- **Keys must be unique**
- **Values can be duplicate**

### Syntax:
```java
HashMap<String, Integer> map = new HashMap<>();
```

### Insert & Update:
```java
map.put("India", 10);
map.put("USA", 20);
map.put("USA", 40); // Updates existing key
```

### Search in HashMap:
```java
if (map.containsKey("India")) {
    System.out.println("India is in the map with value: " + map.get("India"));
}
```

### Removing an Element:
```java
map.remove("USA");
```

### Iterating Over HashMap
#### Using `entrySet()` (Recommended)
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```

#### Using `keySet()` (Keys Only)
```java
for (String key : map.keySet()) {
    System.out.println("Key: " + key);
}
```

#### Using `values()` (Values Only)
```java
for (Integer value : map.values()) {
    System.out.println("Value: " + value);
}
```

#### Using Java 8 `forEach` (Lambda Expression)
```java
map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
```

---

# HashMap Implementation
- Implemented as an **array of linked lists**
- Each array index is a **bucket**
- **Hashing** is used to determine the bucket index

### Hashing Process
```
Key -> Hash Function -> Bucket Index
```

### Rehashing (If Load Factor Exceeds Threshold)
- **Double the array size**
- **Recompute hash for existing keys**

### Time Complexity
| Case          | Complexity |
|--------------|------------|
| Best Case    | O(1)       |
| Average Case | O(λ)       |
| Worst Case   | O(n)       |

---




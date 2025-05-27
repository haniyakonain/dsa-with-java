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
- **typed language**

## Programming Basics

### Escape Sequences

| Language | Syntax Example                | Description         |
|----------|-------------------------------|---------------------|
| Bash     | `echo -e "Hello\nWorld"`      | Enables escapes     |
| Java     | `System.out.println("Hello\nWorld");` | `\n` = newline |
| JavaScript | `console.log("Hello\\nWorld");` | Escapes in strings  |

---

### Flowchart Symbols

| Symbol        | Meaning             |
|---------------|---------------------|
| Circle        | Start / End         |
| Diamond       | Decision (if/else)  |
| Parallelogram | Input / Output      |
| Square        | Process / Operation |

---

### Pseudocode

Pseudocode is a human-readable way to describe an algorithm before actual coding.

---

## Simple Interest

**Formula:**

```
SI = (P × R × T) / 100
```

- `P`: Principal amount  
- `R`: Rate of interest  
- `T`: Time (in years)

---

## Area Calculation

area of a circle:

```
Area = π × r × r
```

the formula `(3/4) * rad + rad` 

```
float rad = 5;
float result = (3.0f / 4.0f) * rad + rad;
System.out.println("Result: " + result);
```

---

## Sum of First N Natural Numbers

**Formula:**
```
Sum = n × (n + 1) / 2
```

**Example:**
```
int n = 4;
int sum = n * (n + 1) / 2;
System.out.println("Sum: " + sum); // Output: 10
```

---

## Methods in Java

A **method** is similar to a function but is defined inside a class. It can be:

- **Called using an object**, or
- **Called directly if static**

**Example:**
```
public class MyClass {
    void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();
    }
}
```

---

## Literals

Literals are fixed values assigned directly to variables. Examples:

```java
int num = 10;       // integer literal
float pi = 3.14f;   // float literal
char letter = 'A';  // character literal
String name = "Java"; // string literal
```

---

## Identifiers

Identifiers are the **names** used for classes, variables, methods, etc. in Java. They must follow Java naming conventions.

---

## Type Conversion

**Implicit (Widening) Conversion** happens when a smaller data type is assigned to a larger type:

```java
int a = 25;
long b = a;
```

**Hierarchy:**
```
byte → short → int → float → long → double
```

**Note:** Going from a larger type to a smaller type may result in **lossy conversion**.

---

## Type Casting

**Explicit (Narrowing) Conversion** using type casting:

```java
float a = 25.34f;
int b = (int) a; // b = 25
```

---

## Type Promotion in Expressions

Java promotes `byte`, `short`, and `char` to `int` in arithmetic expressions.

```java
byte a = 10;
byte b = 20;
// byte c = a + b; // Error
int c = a + b;     // Correct
```

---

## Ternary Operator

Used to assign a value based on a condition in a single line:

```java
int max = (a > b) ? a : b;
```

Syntax:
```
condition ? expression_if_true : expression_if_false;
```

---

# 📘 Java Functions & Concepts

## 🔢 Last Digit & Removing Digits

* **Get Last Digit**:

  ```java
  int lastDigit = number % 10;
  ```

* **Remove Last Digit** (truncate):

  ```java
  number = number / 10;
  ```

---

## 🧩 Functions / Methods in Java

### 📂 Types of Functions

1. **User-defined Functions**
   Functions created by the programmer, e.g., `factorial()`, `sum()`.

2. **Built-in Functions**
   Provided by Java libraries, e.g.:

   ```java
   Math.pow(base, exponent);
   Math.sqrt(number);
   Math.max(a, b);
   ```

---

### ✏️ Creating a Function

**Syntax (no parameters)**:

```java
returnType functionName() {
    // body
    return value;
}
```

**Calling the Function**:

```java
functionName(); // inside main
```

---

### 📥 Function with Parameters

**Syntax**:

```java
returnType functionName(type param1, type param2) {
    // body
    return value;
}
```

* **Formal Parameters**: Parameters in the function definition
* **Actual Parameters**: Arguments passed during the function call

> ☕ In Java, **Call by Value** is used:
> The function receives a **copy** of the actual value, so the original variable is **not changed**.

---

## 🔁 Function Overloading

Using the same function name with different parameters:

### 📌 Examples:

1. **Different Data Types**

   ```java
   void mul(int a, int b) { ... }
   void mul(long a, long b) { ... }
   ```

2. **Different Number of Parameters**

   ```java
   void div(int a) { ... }
   void div(int a, int b) { ... }
   ```

---

## 🔄 Number Conversions

### ⚙️ Binary to Decimal

```java
int n = binaryInput;
int decimal = 0, power = 0;

while(n > 0) {
    int lastDigit = n % 10;
    decimal += lastDigit * Math.pow(2, power);
    power++;
    n = n / 10;
}
```

---

### ⚙️ Decimal to Binary

```java
int n = decimalInput;
String binary = "";

while(n > 0) {
    int rem = n % 2;
    binary = rem + binary;
    n = n / 2;
}
```

---

## 🧭 Scope in Java

### 1. **Method Scope**

Variables declared inside a method:

```java
void example() {
    int x = 10; // Only accessible within this method
}
```

### 2. **Block Scope**

Variables declared inside blocks like loops, `if`, `while`, etc.

---

## 🔐 Access Modifiers (Visibility)

| Modifier    | Visibility                                        |
| ----------- | ------------------------------------------------- |
| `public`    | Visible everywhere                                |
| `private`   | Visible only within the same class                |
| `protected` | Visible in the same package or subclasses         |
| *(default)* | Visible only within the same package (no keyword) |

---

# Arrays in Java
### What are Arrays?
- 0 based indexing
- Non-primitive data type
- A data structure in general
- Collection of items (elements)
- Linear memory allocation
- Stored in **contiguous memory locations**
- Accessed using an **index or position number**
- Two types: **Static and Dynamic**
- Java does not support dynamic arrays directly, but it provides **ArrayList** from `java.util` package

  operations - 
  create
  input
  output
  update

### Memory Calculation:
```
Memory = Size × Data Type
```

### create an array:
Initialize        declare
dt arrayname[] = new dt[size];
int marks[] = new int[50];
int numbers [] = {1,2,3};
new is a constructor

arrys as argument
1. pass value
wont reflect on main
2. reference
will reflect in main

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

## 📦 Common Use Cases of HashMap

- **Caching (e.g., LRU Cache)**  
  Quickly store and retrieve recently used data to optimize performance.

- **Frequency Counting**  
  Count occurrences of elements such as characters, words, or numbers.

  ```java
  HashMap<Character, Integer> freq = new HashMap<>();
  for (char c : str.toCharArray()) {
      freq.put(c, freq.getOrDefault(c, 0) + 1);
  }

* **Lookup Tables**
  Map keys to corresponding values for fast lookup.

  ```java
  HashMap<String, String> countryCode = new HashMap<>();
  countryCode.put("IN", "India");
  countryCode.put("US", "United States");
  ```

* **Indexing Data**
  Associate objects or IDs with their index or location in a dataset.

  ```java
  HashMap<String, Integer> nameToIndex = new HashMap<>();
  nameToIndex.put("Alice", 0);
  nameToIndex.put("Bob", 1);
  ```




# Java SE 21 Developer Professional 1Z0-130

## Chapter1 - Building Blocks

### Java Basics
- **JVM** -> Java Virtual Machine or JVM is a abstract computing machine that runs 
java program by executing bytecode. It provides platform independence
by translating bytecode to native machine language
- **JRE** -> Java Runtime Environment provides java library and JVM require to run java applications.
- **JDK** -> Java Development Kit is a software development kit which provides JRE and tools
require in development, compile, debug and deployment of Java Application.
- **Class** -> It's the building block of Java Application
- **Object** -> It's a runtime instance of Class
- **Method and Field** -> Java has 2 primary elements method often called function 
and procedure in other language. Field is generally known as variable. Both of them together 
called member of the class.

### Comments
- Another common part of code is called a comment. It's a non-executable part of code
- There are 3 types of comments in java
  - single-line comment (i.e //Program comment)
  - multi-line comment (i.e /* Program comment */)
  - java-doc comment (i.i /** Program comment */)

### Package
- java put classes in package which is logical groupings for classes.
  - Remember by default there is one package called java.lang.* is imported
    - It's core package of Java that contains fundamental classes like
      - String
      - System
      - Math
      - Integer, Double, etc (wrapper classes)
      - Object
      - Exception, Runtime Exception
- two ways to call package (wildcard and other is normal)
  -  java.util.*
  - java.util.Random
- we can set target directory by running javac -d dir package/clazz.java
- we can run from classpath using any one of the following
  - java -cp package.clazz
  - java --classpath package.clazz
  - java --class-path package.clazz
  - ** Try running these examples
    - [classA](buidlingBlocks/package/packageA/ClassA.java)
    - [classB](buidlingBlocks/package/packageB/ClassB.java)

### Order Element of class
- package name (optional)
- import package (optional)
- Top-level type declaration (mandatory)
- Field declarations (optional)
- Method declarations (optional)

### Order of Initialization
- Field and initializer block are run in the order they appear in the code
- The constructor runs after all fields and instance initializer block have run.

## Chapter2


## Chapter 7 - Beyond Classes
- interface -> Interface describes actions an Object implements the interface can perform.
- abstract class -> A class which can be instantiated. It acts as a base class to describe common behavior it's sub-class can perform
- record -> It's a special class which represents immutable data
- enum -> It's a special kind of class whose instances are known at compile-time.
- sealed class -> A class or interface which can be extended or implemented by those class and interfaces permitted to do so.

## Chapter 8 - Lambda and Functional Interface
- Functional Interface -> Interfaces having exactly one abstract method.
  - remember it excludes method which belongs to Object class. 
- Lambda -> It's an anonymous function which provides implementation of functional interfaces.  
  - i.e. Functional exp = a -> Math.round(a);
- Method Reference
  - Functional exp = Math::round;
  - It can be classified as
    - static method -> uses static methods
    - instance method on particular object
    - instance method on a parameter
    - Constructor 

- Built-in functional Interfaces
  - [Supplier<T> -> T get();](lamda&functionalInterface/SupplierDemo.java)
  - [Consumer<T> -> void accept(T);](lamda&functionalInterface/ConsumerDemo.java)
  - [BiConsumer<T,U> -> void accept(T, U);](lamda&functionalInterface/BiConsumerDemo.java)
  - [Predicate<T> -> boolean test(T);](lamda&functionalInterface/PredicateDemo.java)
  - [BiPredicate<T,U> -> boolean test(T,U);](lamda&functionalInterface/BiPredicateDemo.java)
  - [Function<T,R> -> R apply(T);](lamda&functionalInterface/FunctionDemo.java)
  - [BiFunction<T,U,R> -> R apply(T, U);](lamda&functionalInterface/BiFunctionDemo.java)
  - [UnaryOperator<T> -> T apply(T);](lamda&functionalInterface/UnaryOperatorDemo.java)
  - [BinaryOperator<T> -> T apply(T,T);](lamda&functionalInterface/BinaryOperatorDemo.java)

## Chapter 9 - Collections and Generics
- Comparable vs Comparator

## Chapter 10 - Optional and Stream
- Optional Method signatures
  - public static  Optional<T> empty();
  - public static  Optional<T> of(T);
  - public void ifPresent(Consumer<T> c);
  - public boolean isPresent();
  - pubic boolean isEmpty();
  - public T get();
  - public T orElse(T other);
  - public T orElseGet(Supplier<T> sup);
  - public T orElseThrow(); // Throw NoSuchElementException
  - public T orElseThrow(Supplier<T> sub);
  - [Demo](/optionalAndStream/optional/Main.java)
- Stream Methods
  - Stream is the sequence of data
  - Finite intermediate Operations
    - empty()
    - of()
    - list.parallelStream()
  - Infinite intermediate operation
    - generate()
    - iterator()
  - Terminal Operations
    - void forEach() -> does not Terminate
    - long count() -> does not Terminate
    - Optional<T> findAny(), Optional<T> findFirst() -> Terminate
    - boolean allMatch(Predicate<? super T>), boolean anyMatch(Predicate<? super T>), boolean noneMatch(Predicate<? super T>) -> Sometime terminates
    - reduce() -> doesn't Terminate
    - collect() -> doesn't Terminate
  - Reducing
    - reduce has different overloaded methods 
    - T reduce(T init, BinaryOperator<? super T> accumulator);
    - Optional<T> reduce(BinaryOperation<? super T> accumulator);
    - U reduce(U init, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
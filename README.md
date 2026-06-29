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
- Lambda 
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
  - Predicate<T> -> boolean test(T);
  - BiPredicate<T,U> -> boolean test(T,U);
  - Function<T,R> -> R apply(T);
  - BiFunction<T,U,R> -> R apply(T, U);
  - UnaryOperator<T> -> T apply(T)
  - BinaryOperator<T> -> T apply(T,T);
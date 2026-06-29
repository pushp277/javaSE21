package demo.lambda.binaryoperator;

import java.util.function.*;
import java.util.*;

/**
 * @author Raj, Pushp
 * Binary Operator is being used for taking 2 parameter of same time and return the same type
 * public abstract interface BinaryOperator<T>{
 *     public abstract T apply(T val);
 * }
 */
public class BinaryOperatorDemo{
    public static void main(String... args) {
        BinaryOperator<String> operator = String::concat;

        System.out.println("concat string: "+operator.apply("abc", "def"));
    }
}
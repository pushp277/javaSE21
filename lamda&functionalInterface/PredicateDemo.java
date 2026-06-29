package demo.lambda.predicate;

import java.util.function.*;
import java.util.*;

/**
 * @author Raj, Pushp
 * predicate is mostly use for filtering and matching
 * public abstract interface Predicate<T>{
 *     public abstract boolean test(T val);
 * }
 */
public class PredicateDemo{

    public static void main(String... args) {
        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("abc"));
    }
}

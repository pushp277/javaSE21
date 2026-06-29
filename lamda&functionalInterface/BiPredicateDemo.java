package demo.lambda.bipredicate;

import java.util.function.*;
import java.util.*;

/**
 * @author Raj, Pushp
 * BiPredicate can we used for filter and matching similar to predicate
 * public abstract interface BiPredicate<T,U>{
 *     public abstract boolean test(T t1, U t2);
 * }
 */
public class BiPredicateDemo{
    public static void main(String[] args){
       BiPredicate<String, String> predicate = String::startsWith;

       System.out.println(predicate.test("abc", "a"));
       System.out.println(predicate.test("abc","b"));
    }
}
package demo.lambda.bipredicate;

import java.util.function.*;
import java.util.*;

public class BiPredicateDemo{
    public static void main(String[] args){
       BiPredicate<String, String> predicate = String::startsWith;

       System.out.println(predicate.test("abc", "a"));
       System.out.println(predicate.test("abc","b"));
    }
}
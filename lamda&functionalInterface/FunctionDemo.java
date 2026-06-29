package demo.lambda.function;

import java.util.function.*;
import java.util.*;

/**
 * @author Raj, Pushp
 * Function Funcition interface is used when we want to have object which accept a type T and returns Type R
 * public abstract interface Function<T,R>{
 *     public abstract R apply(T val);
 * }
 */
public class FunctionDemo{
    public static void main(String... args){
        Function<ArrayList<Integer>, Integer> function = ArrayList::size;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(32);
        arr.add(23);
        arr.add(11);

        System.out.println(function.apply(arr));
    }
}
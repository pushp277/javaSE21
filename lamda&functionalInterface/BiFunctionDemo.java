package demo.lambda.bifunction;

import java.util.*;
import java.util.function.*;

/**
 * @author Raj, Pushp
 * BiFunction is defined when we want to get some different type of 2 input of different type
 * public abstract interface BiFunction<T,V,R>{
 *     public abstract R apply(T t1, V t2);
 * }
 */
public class BiFunctionDemo{
    public static void main(String[] args){
        BiFunction<ArrayList<Integer>, Integer, Boolean> function = ArrayList::contains;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(32);
        arr.add(21);
        arr.add(54);

        System.out.println(function.apply(arr, 21));
        System.out.println(function.apply(arr, 43));
    }
}
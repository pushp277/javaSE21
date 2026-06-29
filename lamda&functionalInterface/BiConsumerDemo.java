package demo.lambda.biconsumer;

import java.util.*;
import java.util.function.*;

/**
 * @author Raj, Pushp
 * It's a functional interface to accept two values
 * public abstract interface BiConsumer/<T,U>{
 *     public abstract void accept(T val1, U val2);
 * }
 */
public class BiConsumerDemo{
    public static void main(String... args){
        Map<Integer, Integer> map = new HashMap<>();

        BiConsumer<Integer,Integer> mapConsumer = map::put;

        mapConsumer.accept(23,45);
        mapConsumer.accept(54,34);

        System.out.println(map);
    }
}
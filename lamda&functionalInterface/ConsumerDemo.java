package demo.lambda.consumer;
import java.util.*;
import java.util.function.*;

/**
 * @author Raj, Pushp
 * Consumer Functional Interface accepts single values
 * public abstract interface Consumer<T>{
 *     public abstract void accept(T val);
 * }
 */
public class ConsumerDemo{
    public static void main(String... args){
        List<Integer> array = new ArrayList<>();
        Consumer<Integer> consumer = array::add;

        consumer.accept(23);
        consumer.accept(43);

        System.out.println(array);
    }
}
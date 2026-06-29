package demo.lambda.unary;

import java.util.function.*;

/**
 * @author Raj, Pushp
 * UnaryOperator is being used when we want to accept some type and return same type
 * public abstract UnaryOperator<T>{
 *     public abstract T apply(T val);
 * }
 */
public class UnaryOperatorDemo{
    public static void main(String... args){
        UnaryOperator<String> operator = String::toUpperCase;

        System.out.println(operator.apply("pushp"));
    }
}
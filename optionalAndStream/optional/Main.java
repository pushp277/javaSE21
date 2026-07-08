package org.javaSE21.optionalAndStream.optional;
import java.util.Optional;

public class Main{
    public static <T> Optional<T> createEmpty(){
        return Optional.empty();
    }

    public static <T> Optional<T> integerOptional(T t){
       return Optional.of(t);
    }

    public static void main(String... args){
        Optional<Integer> emptyOptional = Main.<Integer>createEmpty();
        //Optional with empty value
        Optional<Integer> intOptional = Main.<Integer>integerOptional(34);

        //Optional with emptyValue
        System.out.println(emptyOptional.orElseGet(()->23));
        System.out.println(intOptional.orElseGet(()->0));
    //    System.out.println(emptyOptional.orElseThrow());
        intOptional.ifPresent((c) -> {System.out.println(c);});
    }
}
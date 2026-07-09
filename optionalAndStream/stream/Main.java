package org.javaSE21.optionalAndStream.stream;
import java.util.stream.Stream;

public class Main{
    public static void main(String... args){
        //Finite Stream
        Stream<Integer> stream = Stream.empty();
        Stream<Integer> streamOf = Stream.of(34, 43, 36,2,34);
        System.out.println(stream);
     //   streamOf.forEach((c)->{System.out.println(c);});

        //Infinte Stream
        Stream<Double> streamGenerate = Stream.generate(Math::random);
        Stream<Integer> streamIterator = Stream.iterate(0, n->n+1);

        System.out.println(streamOf.findFirst().get());
       System.out.println(streamOf.findAny().get());
    }
}
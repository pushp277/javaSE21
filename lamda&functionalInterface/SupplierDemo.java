package demo.lambda.supplier;
import java.util.*;
import java.util.function.*;

/**
 * @author Raj, Pushp
 * Supplier functional interface demo
 * public interface Supplier{
 *    public abstact T get();
 * }
 */
public class SupplierDemo{

    public static void main(String[] args){
        Supplier<ArrayList<Integer>> sup = () -> new ArrayList<>();
        Supplier<ArrayList<Integer>> supMethod = ArrayList::new;

        List<Integer> list1 = sup.get();
        List<Integer> list2 = supMethod.get();

        list1.add(32);
        list2.add(33);

        System.out.println(list1);
        System.out.println(list2);
    }
}
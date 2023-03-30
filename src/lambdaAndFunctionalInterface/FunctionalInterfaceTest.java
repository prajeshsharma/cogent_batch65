package lambdaAndFunctionalInterface;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tamara");
        names.add("Tammy");
        names.add("VTEN");
        names.add("Tibbles");
        names.add("Arthur");
        names.add("Francine");
        names.add("Buster");
        Predicate<String> predicate = s -> s.startsWith("T"); // predicate
        for (String name : names)
            if (predicate.test(name))
                System.out.print(name + ' ');
        System.out.println();

        Supplier<Double> supplier = () -> Math.random(); // supplier
        System.out.println(supplier.get());

        Consumer<String> consumer = (x) -> System.out.println(x.toLowerCase()); // consumer
        consumer.accept("\"I HATE WHITE MILK!\", shouted Nathan");
    }
}

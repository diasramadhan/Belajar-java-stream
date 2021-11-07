package code.okt19.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class OperationStreamTest {
    @Test
    void testMapStream(){
        List<String> names = List.of("Dias","Nur","Ramadhan");
        Stream<String> stream = names.stream();

        Stream<String> upperStream = stream.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        upperStream.forEach(System.out::println);

        Stream<String> stream1 = names.stream();
        stream1.map(String::toLowerCase).forEach(s -> System.out.println(s));

    }
}

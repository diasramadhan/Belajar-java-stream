package code.okt19.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    void testMap(){
        List.of("Dias","Nur","Ramadhan").stream()
                .map(s -> s.toUpperCase())
                .map(s -> s.length())
                .forEach(integer -> System.out.println(integer));
    }

    @Test
    void testFlapMap(){
        List.of("Dias","Nur","Ramadhan").stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                })
                .flatMap((String s) -> {
                    return Stream.of(s, s.length());
                })
                .forEach(System.out::println);
    }

}

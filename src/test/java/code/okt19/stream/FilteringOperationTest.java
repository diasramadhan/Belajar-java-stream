package code.okt19.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

public class FilteringOperationTest {
    @Test
    void testFilter(){
        List.of("Dias","Nur","Ramadhan","Noermala","Riska","Agustin").stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 5;
                    }
                })
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9,0).stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .forEach(System.out::println);
    }

    @Test
    void testDistinct(){
        List.of("Dias","Nur","Ramadhan","Dias","Nur","Ramadhan").stream()
                .distinct()
                .forEach(System.out::println);
    }
}

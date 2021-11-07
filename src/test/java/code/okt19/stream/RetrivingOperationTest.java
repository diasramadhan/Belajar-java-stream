package code.okt19.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RetrivingOperationTest {
    @Test
    void testLimit(){
        List.of("Dias","Nur","Ramadhan","Noermala","Riska","Agustin").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip(){
        List.of("Dias","Nur","Ramadhan","Noermala","Riska","Agustin").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile(){
        List.of("Dias","Nur","Ramadhan","Noermala","Riska","Agustin").stream()
                .takeWhile(s -> s.length() < 5)
                .forEach(System.out::println);
    }
    @Test
    void testDropWhile(){
        List.of("Dias","Nur","Ramadhan","Noermala","Riska","Agustin").stream()
                .dropWhile(s -> s.length() < 5)
                .forEach(System.out::println);
    }
}

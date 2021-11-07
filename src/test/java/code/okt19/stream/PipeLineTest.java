package code.okt19.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

public class PipeLineTest {
    @Test
    void testCreatePipeLine(){
        List<String> strings = List.of("Dias","Nur","Ramadhan");
        strings.stream()
                .map(s -> s.toUpperCase())
                .map(s -> "HELLO " + s)
                .forEach(s -> System.out.println(s));
    }
    @Test
    void testTerminalOperation(){

        List<String> strings = List.of("Dias","Nur","Ramadhan");
        strings.stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String name) {
                        System.out.println("Change " + name + " to Uppercase");
                        return name.toUpperCase();
                    }
                })
                .forEach(System.out::println);

    }

}

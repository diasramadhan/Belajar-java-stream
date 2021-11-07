package code.okt19.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream(){

        Stream<String> emptySting = Stream.empty();

        Stream<String> oneStream = Stream.of("Dias");

        Stream<String> emtyOrNotStream = Stream.ofNullable(null);

    }

    @Test
    void testCreateStreamFromArray(){
        Stream<String> arrayStream = Stream.of("Dias","Nur","Ramadhan");
        arrayStream.forEach(s -> System.out.println(s));


        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        intStream.forEach(integer -> System.out.println(integer));

        String [] names = {
                "Dias","Nur","Ramadhan"
        };
        Stream<String> streamFromArray = Arrays.stream(names);
        Stream<String> streamFromArrayStream = Stream.of(names);
        streamFromArray.forEach(name -> System.out.println(name));
    }

    @Test
    void testCreateFromCollection(){
        Collection<String> collection = List.of("Dias","Nur","Ramadhan");
        Stream<String> stringStreamtream = collection.stream();

        stringStreamtream.forEach(System.out::println);
//        stringStreamtream.forEach(System.out::println); //ERROR stream hanya mengalir sekali
    }

    @Test
    void testCreateStreamIterate(){
        //infinite stream
        Stream<String> stringStream = Stream.generate(() -> "Code okt 19");
//        stringStream.forEach(System.out::println);
        Stream<Integer> integerStream = Stream.iterate(1, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        });
        integerStream.forEach(integer -> System.out.println(integer));

        /**
         * 1
         * 2
         * 3
         */
    }
    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> stringBuilder = Stream.builder();
        stringBuilder.accept("Dias");
        stringBuilder.add("Dias");
        stringBuilder.add("Nur");

        Stream<String> stringStream = stringBuilder.build();
        stringStream.forEach(System.out::println);

        Stream.Builder<Integer> builder = Stream.builder();
        for (int i = 0; i < 10; i++) {
            builder.add(i);
        }
        Stream<Integer> build = builder.build();
        build.forEach(integer -> System.out.println(integer));
    }
    @Test
    void testCreateStreamBuilderSimple(){
        Stream<Object> build = Stream.builder()
                .add("Dias").add("Nur").add("Ramadhan").build();
        build.forEach(System.out::println);

        Stream<Object> stream = Stream.builder()
                .add("Dias").add("Nur").add("Ramadhan").build();

        stream.forEach(System.out::println);
    }




}

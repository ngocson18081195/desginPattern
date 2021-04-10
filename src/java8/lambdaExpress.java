package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 3/31/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 3/31/2021
 */

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

public class lambdaExpress {

    int outerNum;

    public static void dosomething() {
        final int num = 1;
        Converter<Integer, String> integerStringConverter = from -> {
            return String.valueOf(from + num);
        };
        String convert = integerStringConverter.convert(2);
        System.out.println(convert);
    }

    public static void doSomething2() {
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

        stringConverter.convert(2); // 3
    }

    public static void doSomething3() {
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

        stringConverter.convert(2); // 3

    }

    public static void main(String[] args) {
//        dosomething();
//        List<String> strings = new ArrayList<>();
//        strings.forEach();
//        strings.stream().forEach();

        Stream.iterate(1, integer -> integer + 1)
                .filter(integer -> integer % 3 == 0)
                .limit(12)
                .forEach(System.out::println);

        Optional<String> me = Optional.of("gpcoder");
        Optional<String> emptyOptional = Optional.empty();


        System.out.println(me.filter(g -> g.equals("GPCODER"))); //Optional.empty

    }

}

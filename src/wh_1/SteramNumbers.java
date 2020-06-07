package wh_1;

import java.util.stream.Stream;

public class SteramNumbers {
    public static void main(String[] args) {
        Stream.iterate(8, x -> x + 1)
                .filter(x -> x > 100 && x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .forEach(System.out::println);
    }
}

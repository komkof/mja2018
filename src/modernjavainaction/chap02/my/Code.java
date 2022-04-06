package modernjavainaction.chap02.my;

import modernjavainaction.chap04.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Code {


    public static void main(String[] args) {
        var list = Stream.of("Hello", "World")
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.print(list);
        Stream.of(1, 2, 3, 4, 5).map(integer -> integer * integer).forEach(System.out::println);

        var a1 = List.of(1, 2, 3);
        var a2 = List.of(3, 4);
        var a3 = new int[6][2];

        Stream.of(new Integer[]{1, 2, 3}, new Integer[]{3, 4})
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        a1.stream().flatMap(i -> a2.stream().map(j -> new int[]{i, j})).filter(item -> (item[0] + item[1]) % 3 == 0).forEach(ints -> System.out.printf("(%d,%d) ", ints[0], ints[1]));

//        int count = 0;
//        for (int k : a1)
//            for (int i : a2)
//                a3[count++] = new int[]{k, i};
//
//        for (int[] ints : a3)
//            System.out.printf("(%d,%d) ", ints[0], ints[1]);

    }

}


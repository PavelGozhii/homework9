package com.company;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Operators {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<Object, Object> minMaxConsumer) {
        Object[] arr = stream.sorted(order).toArray();
        if (arr.length == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(arr[0], arr[arr.length - 1]);
        }
    }
}

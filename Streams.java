package com.company;

import java.util.stream.IntStream;

public class Streams {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n * n / 10) % 1000);
    }

    public static void main(String[] arg) {
        IntStream stream = pseudoRandomStream(13);
        int[] arr = stream.limit(10).toArray();
        for (int i : arr) {
            System.out.println(i);
        }
    }

}

package com.jcanepa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int[] sequence = new int[]{
                3, 99, 4, 6, 23, 1, -2, 44, 21, 14
        };

        QuickSort.quickSort(
                sequence,
                0,
                (sequence.length - 1));

        System.out.println(
                Arrays.toString(sequence));
    }
}

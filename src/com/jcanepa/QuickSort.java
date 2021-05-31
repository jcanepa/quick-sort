package com.jcanepa;

public class QuickSort
{
    private static int depth = 0;
    public static final boolean DEBUG = true;

    public static void  quickSort(int[] data, int start, int end)
    {
        depth ++;

        int i = start;
        int j = end;
        int pivot = data[start];

        /*
         * Partition
         */
        do {
            if (DEBUG)
                System.out.println("[" + pivot + "]");
                printList(data);

            while (data[i] < pivot)
                i ++;

            while (data[j] > pivot)
                j--;

            if (i <= j) {
                /*
                 * Swap two elements
                 */
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;

                // Move forward one step.
                i ++;
                j --;
            }
        } while (i <= j);

        /*
         * A sublist still exists to the left of j's position.
         */
        if (start < j)
            quickSort(data, start, j);

        /*
         * A sublist still exists to the right of i's position.
         */
        if (i < end)
            quickSort(data, i, end);

        depth --;
    }

    public static void printSublist(int[] data, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void printList(int[] data) {
        for (int item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

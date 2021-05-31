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
                System.out.println("@" + pivot);
                printList(data);

            while (data[i] < pivot)
                i ++;

            while (data[j] > pivot)
                j--;

            /*
             * Swap two elements and progress pointers one step.
             */
            if (i <= j) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;

                i ++;
                j --;
            }

        } while (i <= j);

        /*
         * Recursive method calls:
         */
        if (start < j) // A sublist still exists to the left of j's position.
            quickSort(data, start, j);

        if (i < end) // A sublist still exists to the right of i's position.
            quickSort(data, i, end);

        depth --;
    }

    /**
     * Print the list sequence.
     * @param data
     */
    public static void printList(int[] data) {
        for (int item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

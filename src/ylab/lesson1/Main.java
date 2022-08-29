package ylab.lesson1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {5, 6, 3, 2, 5, 1, 4, 9};
        print(arrays);
        printSort(arrays);

        // task1
        double[][] array = new double[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                array[i][j] = Math.random();

        }

        double min = array[0][0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                min = Math.min(min, array[i][j]);
        }
        System.out.println(min);

        double max = array[0][0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                max = Math.max(max, array[i][j]);
        }
        System.out.println(max);

        double avr = array[0][0];
        double x = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                avr += x;
        }
        System.out.println(avr / array.length);
    }


    // task2
    public static int[] bubbleSort(int[] array) {
        int[] arrays = {5, 6, 3, 2, 5, 1, 4, 9};
        for (int i = arrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int arr = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = arr;
                }
            }
        }

        return array;
    }

    public static int[] print(int[] numbersSort) {
        bubbleSort(numbersSort);
        for (int i = 0; i < numbersSort.length; i++) {
            System.out.println(numbersSort[i] + ", ");
        }
        return numbersSort;
    }

    public static int[] printSort(int[] numbers) {
        Integer[] a = {5, 6, 3, 2, 5, 1, 4, 9};
        HashSet<Integer> tmp = new HashSet<Integer>(Arrays.asList(a));
        Integer[] b = new Integer[tmp.size()];
        b = (Integer[]) tmp.toArray(b);
        System.out.println(Arrays.toString(b));
        return numbers;
    }


    static class test {
        @Test
        void test1() {
            int[] arrays = {5, 6, 3, 2, 5, 1, 4, 9};
            int[] expected = bubbleSort(arrays);
            int[] result = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
            assertArrayEquals(result, expected);
        }

        @Test
        void test2() {
            int[] arrays = {5, 6, 3, 2, 5, 1, 4, 9};
            int[] expected = print(arrays);
            int[] result = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
            assertArrayEquals(result, expected);
        }

        @Test
        void test3() {
            int[] arrays = {5, 6, 3, 2, 5, 1, 4, 9};
            int[] expected = printSort(arrays);
            int[] result = new int[]{1, 2, 3, 4, 5, 6, 9};
            assertArrayEquals(result, expected);
        }
    }
}
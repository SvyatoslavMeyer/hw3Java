package java_hw3;

// Реализовать алгоритм сортировки слиянием на java(целые числа).

import java.util.Arrays;

public class hwJTask1 {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 7, 11, 66, 0, 69, 28, 17, 25, 1, 4, 8, 74};
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers, int start, int end) {
        if (end <= start) return;

        int middle = start + (end - start) / 2;
        mergeSort(numbers, start, middle);
        mergeSort(numbers, middle + 1, end);

        int[] temp = Arrays.copyOf(numbers, numbers.length);

        int left = start;
        int right = middle + 1;
        for (int i = start; i <= end; i++) {
            if (left > middle) numbers[i] = temp[right++];
            else if (right > end) numbers[i] = temp[left++];
            else if (temp[left] < temp[right]) numbers[i] = temp[left++];
            else numbers[i] = temp[right++];
        }
    }
}

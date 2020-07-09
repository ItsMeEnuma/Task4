package sample.sort;

import java.util.Arrays;

public class ShakerSort implements Sort {
    @Override
    public SortState sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int last_swap;
        int swap = 0;
        int comp = 0;

        do {
            last_swap = 0;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                    last_swap = i;
                    swap++;
                }
                comp++;
            }
            right = last_swap;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    int buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                    last_swap = i;
                    swap++;
                }
                comp++;
            }
            left = last_swap;
        } while (last_swap != 0);

        SortState sortState = new SortState(arr.length, swap, comp);
        return sortState;
    }
}

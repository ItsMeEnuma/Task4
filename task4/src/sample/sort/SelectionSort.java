package sample.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static List<SortState> sort(int[] arr){

        List<SortState> list = new ArrayList<>();

        int size = arr.length;
        int step = 0;

        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                boolean is_swap = false;

                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }

                step++;
                list.add(new SortState(arr, i, j, is_swap, step));
            }
        }
        return list;
    }
}

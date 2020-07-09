package sample.sort;

import java.util.Arrays;

public class BubbleSort implements Sort {
    @Override
    public SortState sort(int[] arr) {

        int swap = 0;
        int comp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    swap++;
                }
                comp++;
            }
        }

        SortState sortState = new SortState(arr.length,swap,comp);
        return  sortState;
    }
}

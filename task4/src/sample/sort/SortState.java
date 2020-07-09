package sample.sort;

import java.util.Arrays;

public class SortState {

    private int[] arr;
    private int firstIndex;
    private int secondIndex;
    private boolean isSwap;
    private int step;


    public SortState(int[] arr, int firstIndex, int secondIndex, boolean isSwap, int step) {

        this.arr = arr.clone();
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
        this.isSwap = isSwap;
        this.step = step;
    }

    public int[] getArr() {
        return arr;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getSecondIndex() {
        return secondIndex;
    }

    public boolean isSwap() {
        return isSwap;
    }

    public int getStep() {
        return step;
    }

    @Override
    public String toString() {
        return "step: " + step + "\t" +
                " arr: " + Arrays.toString(arr) +
                " i: " + firstIndex +
                " j: " + secondIndex +
                " is compare: " + isSwap +
                '\n';
    }
}
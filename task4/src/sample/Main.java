package sample;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import sample.sort.BubbleSort;
import sample.sort.ShakerSort;
import sample.sort.SortState;

import java.util.Scanner;

public class Main{

    public static void displayStatistic(int size){
        XYChart swapChart = new XYChartBuilder().
                xAxisTitle("array size")
                .yAxisTitle("swap")
                .width(600)
                .height(400)
                .build();

        XYChart compChart = new XYChartBuilder().
                xAxisTitle("array size")
                .yAxisTitle("comp")
                .width(600)
                .height(400)
                .build();

        BubbleSort bubbleSort = new BubbleSort();
        ShakerSort shakerSort = new ShakerSort();

        int[] arraySize = new int[size];
        int[] arrayBubbleSortComp = new int[size];
        int[] arrayBubbleSortSwap = new int[size];
        int[] arrayShakerSortComp = new int[size];
        int[] arrayShakerSortSwap = new int[size];

        for(int i = 0; i < size; i++){
            arraySize[i] = i + 1;
            int[] array = Utils.generateRandomArray(i + 1);
            SortState bubbleSortState = bubbleSort.sort(array.clone());
            SortState shakerSortState = shakerSort.sort(array);
            arrayBubbleSortComp[i] = bubbleSortState.getCompCount();
            arrayBubbleSortSwap[i] = bubbleSortState.getSwapCount();
            arrayShakerSortComp[i] = shakerSortState.getCompCount();
            arrayShakerSortSwap[i] = shakerSortState.getSwapCount();
        }

        swapChart.addSeries("bubbleSort", arraySize, arrayBubbleSortSwap);
        swapChart.addSeries("shakerSort", arraySize, arrayShakerSortSwap);
        compChart.addSeries("bubbleSort", arraySize, arrayBubbleSortComp);
        compChart.addSeries("shakerSort", arraySize, arrayShakerSortComp);


        new SwingWrapper<>(swapChart).displayChart();
        new SwingWrapper<>(compChart).displayChart();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("enter check count:");
            int a = scanner.nextInt();
            if (a > 0) {
                displayStatistic(a);
            }
        }
    }
}

package sample;

import java.util.Random;

public class Utils {
    public static int[] generateRandomArray(int size){
        Random random = new Random();
        int res[] = new int[size];
        for(int i = 0; i < size; i++){
            res[i] = random.nextInt(size);
        }
        return res;
    }
    public static int[] generateBadArray(int size){
        int res[] = new int[size];
        for(int i = 0; i < size; i++){
            res[i] = size - 1 - i;
        }
        return res;
    }
}

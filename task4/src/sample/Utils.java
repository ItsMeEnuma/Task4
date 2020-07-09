package sample;

public class Utils {

    public static int[] toIntArray(String string) {
        String[] str = string.trim().split("\\s+");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        return arr;
    }
}

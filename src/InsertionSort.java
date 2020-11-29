import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            for (; j >= 0 && list[j] > temp; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] list = {9, 7, 5, 4, 3};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}

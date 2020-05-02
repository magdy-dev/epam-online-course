package task2;
import java.util.Arrays;
import java.util.Collections;

//. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
public class Question27 {
    public static void kLargest(Integer[] arr, int k)
    {
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 1, 23, 12, 9,
                30, 2, 50 };
        int k = 3;
        kLargest(arr, k);
    }
}

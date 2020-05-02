package task2;
import java.math.*;
//Сортировка выбором. Дана последовательность чисел n a a a     1 2 .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором

public class Question29 {
    static float geometricMean(int arr[], int n)
    {

        float product = 1;

        for (int i = 0; i < n; i++)
            product = product * arr[i];

        float gm = (float)Math.pow(product, (float)1 / n);
        return gm;
    }


    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length ;
        System.out.println(geometricMean(arr, n));
    }
}

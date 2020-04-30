package task2;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
import java.util.*;
import java.lang.*;
import java.io.*;
public class Question19 {
    static int countNegative(int M[][], int n,
                             int m)
    {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] < 0)
                    count += 1;

                    // no more negative numbers
                    // in this row
                else
                    break;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int M[][] = { { -3, -2, -1, 1 },
                { -2, 2, 3, 4 },
                { 4, 5, 7, 8 } };

        System.out.println(countNegative(M, 3, 4));
    }
}




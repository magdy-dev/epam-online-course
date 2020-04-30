package task2;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
public class Question11 {
    static int sumColumns(int arr[][], int r, int c)
    {
        int sum = 0;

        for (int j = 0; j < c; j++)
        {

            if (arr[0][j] % 2 != 0)
            {
                for (int i = 0; i < r; i++)
                    sum += arr[i][j];
            }
        }

        return sum;
    }


    public static void main (String[] args)
    {
        int arr[][] = {{8, 2, 3, 5},{9, 8, 7, 6}, {1, 2, 5, 5}};
        System.out.println(sumColumns(arr, 3, 4));
    }
}



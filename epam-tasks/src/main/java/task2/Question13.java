package task2;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Question13 {
    static int R = 3;
    static int C = 6;

    static void spiralPrint(int m, int n, int[][] a, int c)
    {
        int i, k = 0, l = 0;
        int count = 0;

        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                count++;

                if (count == c)
                    System.out.println(a[k][i]+" ");
            }
            k++;
            for (i = k; i < m; ++i) {
                count++;

                if (count == c)
                    System.out.println(a[i][n - 1]+" ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    count++;

                    if (count == c)

                        System.out.println(a[m - 1][i]+" ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    count++;

                    if (count == c)
                        System.out.println(a[i][l]+" ");
                }
                l++;
            }
        }
    }

    public static void main (String[] args)
    {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        int k = 17;

        spiralPrint(R, C, a, k);
    }

        }


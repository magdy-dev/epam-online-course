package task2;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
public class Question18 {
    static int m = 4;
    static int n = 4;
    static void row_sum(int arr[][])
    {

        int i,j,sum = 0;

        System.out.print( "\nFinding Sum of each row:\n\n");

        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 4; ++j) {

                sum = sum + arr[i][j];
            }

            System.out.println( "Sum of the row "
                    + i + " = " + sum);
            sum = 0;
        }
    }

    static void column_sum(int arr[][])
    {

        int i,j,sum = 0;

        System.out.print( "\nFinding Sum of each column:\n\n");

        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 4; ++j) {


                sum = sum + arr[j][i];
            }

            System.out.println(
                    "Sum of the column "
                            + i + " = " + sum);

            sum = 0;
        }
    }


    public static void main (String[] args) {
        int i,j;
        int [][]arr = new int[m][n];

        int x = 1;
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                arr[i][j] = x++;

        row_sum(arr);
        column_sum(arr);
    }
}



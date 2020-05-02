package task2;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Question48 {
    static void printWellOrdered(int number, int x, int k)
    {
        if (k == 0)
        {
            System.out.print(number+" ");
            return;
        }

        for (int i = (x + 1); i < 10; i++)
            printWellOrdered(number * 10 +
                    i, i, k - 1);
    }

    static void generateWellOrdered(int k)
    {
        printWellOrdered(0, 0, k);
    }
    public static void main (String[] args)
    {
        int k = 3;
        generateWellOrdered(k);
    }
}
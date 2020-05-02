package task2;
//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию

public class Question49 {

    static int revers(int n)
    {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n =n/10;
        }
        return rev;
    }

    static void getSum(int n)
    {
        n = revers(n);
        int sumOdd = 0, sumEven = 0, c = 1;

        while (n != 0) {

            if (c % 2 == 0)
                sumEven += n % 10;
            else
                sumOdd += n % 10;
            n /= 10;
            c++;
        }

        System.out.println("Sum odd = " + sumOdd);
        System.out.println("Sum even = " + sumEven);
    }

    public static void main(String args[])
    {
        int n = 457892;
        getSum(n);
    }
}


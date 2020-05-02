package task2;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Question39 {
    static int __gcd(int a, int b)
    {

        if (a == 0 || b == 0)
            return 0;

        if (a == b)
            return a;


        if (a > b)
            return __gcd(a-b, b);

        return __gcd(a, b-a);
    }

    static void coprime(int a, int b) {

        if ( __gcd(a, b) == 1)
            System.out.println("Co-Prime");
        else
            System.out.println("Not Co-Prime");
    }


    public static void main (String[] args)
    {
        int a = 5, b = 6;
        coprime(a, b);

        a = 8; b = 16;
        coprime(a, b);
    }
}


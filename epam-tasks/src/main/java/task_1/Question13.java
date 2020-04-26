package task_1;

public class Question13 {
    static int Square (int n){

        int l, k, m;

        l = (n * (n + 1) * (2 * n + 1)) / 6;

        k = (n * (n + 1)) / 2;

        k = k * k;

        m = Math.abs(l - k);

        return m;

    }
    public static void main(String[] args) {

        int n = 100;
        System.out.println(Square(n));

    }
}


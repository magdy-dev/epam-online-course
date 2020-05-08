package task3;

public class Question3 {
//В строке найти количество цифр.
    public static void main(String[] args) {

        int num = 2626;
        int sum = 0;
        int rem;
        while (num > 0) {

            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
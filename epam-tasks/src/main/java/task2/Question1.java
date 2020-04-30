package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
//2.
    public static <n> void main(String[] args) {
        //. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        int s=0;

        for (int i=1 ; i < 6;i++){
            System.out.println(number[i]);

        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number plz ");
       int k=scanner.nextInt();

       for (int i=1;i<6;i++){
           if (number[i] % k==0)
           s=s+number[i];
           System.out.println(s);
       }

    }
}

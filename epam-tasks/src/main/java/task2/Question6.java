package task2;

import java.util.Random;
import java.util.Scanner;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами
public class Question6 {
    public static <n> void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int mass[]=new int[100];
        int sum=0;
        for (int i=1;i<=100;i++){
            mass[i]=Math.sqrt(Random(1000));
            if (i>3){
                for (int j=2;j<=i;j++){
                    if (i%j==0);
                    break;
                    if(j==i){
                        System.out.println("mass["+i+"]="+mass[i]);
                        sum=sum+mass[i];
                    }
                }
                else
                    System.out.println("mass["+i+"]="+mass[i]);
                sum=sum+mass[i];


            }

        }
        System.out.println("sum="+sum);
    }
}

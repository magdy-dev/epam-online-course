package task2;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
import java.util.Scanner;

public class Question5 {
    public static <n> void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a[]=new int [100];
        System.out.println("Enter the number of vector elements");
        int n =scanner.nextInt();
        System.out.println("Entering array elements");
        for (int  i =1;i<=n;i++){
            System.out.println("a["+i+"]=");
            System.out.println(a[i]);

        }
        System.out.println("Output array elements");
        for (int  i=1;i<=n;i++){
            System.out.println(a[i]+"");
            System.out.println("Elements of an array that are greater than or equal to their index");
            for (i=1;i<=n;i++){
                if (a[i]>=i){
                    System.out.println(a[i]+"");
                }
            }

        }

    }
}

package Try;

import java.util.Scanner;

public class try18 {public static void main(String[] args) {

    int m,n,i = 0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter m,n");
    m=scanner.nextInt();
    n=scanner.nextInt();

    while (m <=n){
        System.out.println(m +":");
        for (i:m-1){
            if (m % 1==0){
                System.out.println(i);
                System.out.println(m=m+1);

            }
        }
    }
}
}


package Try;

import java.util.Scanner;

public class try8 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a,b,c,d");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        System.out.println(Math.min(c,d));
        System.out.println(Math.min(a,b));

        System.out.println(Math.max(c+b,a+d));



    }

}

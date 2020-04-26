package task1;

import java .util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number x & y");

        double x= scanner.nextDouble();
        double y= scanner.nextDouble();

        double cosX = Math.cos(x);
        double sinX = Math.sin(x);

        double cosY = Math.cos(y);
        double sinY = Math.sin(y);
        double tanXY = Math.tan(x*y);

        double result = ((sinX+sinY)/(cosX-sinY))*tanXY;
        System.out.println("result = " +result);
    }
}
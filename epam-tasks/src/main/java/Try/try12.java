package Try;

import java.util.Scanner;

public class try12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number ");
        int  x = scanner.nextInt();
        for (int i =1;i<x;i++){
            System.out.println("x ="+i);
        }
    }
}
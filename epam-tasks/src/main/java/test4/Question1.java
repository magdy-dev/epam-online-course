package test4;

import java.util.Scanner;
// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, который находит сумму
// значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
public class Question1 {
    int x, y;
    int sum;

    public void display() {
        System.out.println("display x =" + x);
        System.out.println("display y =" + y);

    }

    public void changingVariables() {
        if (x == x)
            System.out.println(" y =" + y);
        else
            System.out.println(" x =" + x);

    }

    public int sumFind() {
        return  x + y;
    }

    public void findLargest() {
        if (x < y) {
            System.out.println("y="+y);
        } else if (y > x) {
            System.out.println("x"+x);
        }

    }
    public static void main (String args[]){
        Question1 question1=new Question1();

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of the x,y");

        question1.x=scanner.nextInt();
        question1.y=scanner.nextInt();

        question1.display();
        question1.changingVariables();
        question1.findLargest();
        question1.sumFind();


    }
}




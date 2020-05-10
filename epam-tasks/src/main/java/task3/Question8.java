package task3;

import java.util.Scanner;

//Проверить, является ли заданное слово палиндромом.
public class Question8 {
    public static  void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter plz name epam");
        String name = scanner.next();
        String word="epam";

        if (name==word){
            System.out.print("yes right  "+word);

        }
        else {
            System.out.print("sorry u was wrong ");
        }


    }
}

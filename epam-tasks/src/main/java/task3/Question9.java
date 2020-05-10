package task3;

import java.util.Scanner;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Question9 {
    public static  void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter plz name  computer science");
        String word =scanner.next();
        String a="//cake";
        if (word==a){
            System.out.print("error ");


        }
        else {
            System.out.print(word);
        }
    }
}

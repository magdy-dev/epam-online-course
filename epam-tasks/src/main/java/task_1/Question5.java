package task_1;

import java.util.Scanner;

public class Question5 {
    public static <n> void main(String[] args) {



      int mint ,hour ,second;
        System.out.println("enter plz the number of sec");
        Scanner scanner=new Scanner(System.in);
    int seconds  =scanner.nextInt();

        second = seconds % 60;
        hour = seconds / 60;
        mint = seconds % 60;
        hour =hour /60;
        System.out.println(hour+":"+mint+":"+second);




    }
}
package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Question10 {
    public static void main(String[] args) {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        try {
            data = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("enter plz String ");


        char ch = 0;
        try {
            ch = (char)System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int noOFTimeChar=0;
        for (int i=0;i<data.charAt(ch);i++){
            char c=data.charAt(i);
            if (c==ch){
                noOFTimeChar++;
            }
            System.out.print(noOFTimeChar);

        }
         }
    }

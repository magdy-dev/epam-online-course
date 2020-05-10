package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Из заданной строки получить новую, повторив каждый символ дважды.
public class Question11 {
    public String repeatAllTwice(String stng)
    {
        int l = stng.length();
        String newstring = "";
        for (int i = 0; i < l; i++)
        {
            newstring += stng.substring(i,i+1) + stng.substring(i, i+1);
        }
        return newstring;
    }
    public static void main (String[] args)
    {
        Question11 m= new Question11();
        String str1 =  "welcome";
        System.out.println("The given string is: "+str1);
        System.out.println("The new string is: "+m.repeatAllTwice(str1));
    }
}

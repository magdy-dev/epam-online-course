package task3;

//Посчитать количество строчных (маленьких) и прописных (больших)
// букв в введенной строке. Учитывать только английские буквы
public class Question13 { public static void main(String args[])
{
    String str = "i Love Epam Company 1 and love to be there one day ";
    int upper = 0, lower = 0, number = 0, special = 0;

    for(int i = 0; i < str.length(); i++)
    {
        char ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z')
            upper++;
        else if (ch >= 'a' && ch <= 'z')
            lower++;
        else if (ch >= '0' && ch <= '9')
            number++;
        else
            special++;
    }

    System.out.println("Lower case letters : " + lower);
    System.out.println("Upper case letters : " + upper);
    System.out.println("Number : " + number);
    System.out.println("Special characters : " + special);
}
}

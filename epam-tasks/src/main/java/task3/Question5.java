package task3;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих
// пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
public class Question5 {
    public static void main(String args[]) {
        String ma = "   Hello epam  .  Welcome ,    Do you love    epam ,  i hope u  ? ";
        System.out.println(ma.replaceAll("\\s+"," ").trim());
    }
}

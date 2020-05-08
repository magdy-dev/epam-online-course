package task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//В строке найти количество чисел.
public class Question4 {
    public static <n> void main(String[] args) {


    Pattern pattern = Pattern.compile("[0-9]+");
    Matcher matcher = pattern.matcher("test1string1337thingie");


while (matcher.find()) {

        String match = matcher.group();
    }
}
}
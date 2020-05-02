package task2;

//Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
public class Question28 {
    static final int MAX = 26;

    static String encryptStr(String str, int n, int x)
    {


        x = x % MAX;
        char arr[] = str.toCharArray();


        int freq[] = new int[MAX];
        for (int i = 0; i < n; i++)
            freq[arr[i] - 'a']++;

        for (int i = 0; i < n; i++) {

            if (freq[arr[i] - 'a'] % 2 == 0) {
                int pos = (arr[i] - 'a' + x) % MAX;
                arr[i] = (char)(pos + 'a');
            }

            else {
                int pos = (arr[i] - 'a' - x);
                if (pos < 0)
                    pos += MAX;
                arr[i] = (char)(pos + 'a');
            }
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args)
    {
        String s = "abcda";
        int n = s.length();
        int x = 3;
        System.out.println(encryptStr(s, n, x));
    }
}


import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String args[]) {
        String text1;
        String text2;
        boolean IsAnagram;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        text1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        text2 = scanner.nextLine();

        IsAnagram = Length(text1, text2);// ?
        if (IsAnagram == false) {
            System.out.println("У строчек разная длина");
        } else {
            Words(text1, text2);
        }

    }

    public static boolean Length(String txt1, String txt2) {
        boolean IsAnagram = true;
        if (txt1.length() != txt2.length()) {
            System.out.print("Это не анаграмма. ");
            IsAnagram = false;
        }

        return IsAnagram;
    }

    public static void Words(String txt1, String txt2) {
        String words1[] = txt1.split("\\W+");
        String words2[] = txt2.split("\\W+");
        boolean answer = false;

        for (String word1 : words1) {
            for (String word2 : words2) {
                answer = Chars(word1, word2);
            }
        }
        if (answer == true) {
            System.out.println("Это анаграмма");
        } else {
            System.out.println("Это не анаграмма");
        }
    }

    public static Boolean Chars(String word1, String word2) {
        char chars1[] = word1.toCharArray();
        char chars2[] = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean answer;

        if (Arrays.equals(chars1, chars2)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}

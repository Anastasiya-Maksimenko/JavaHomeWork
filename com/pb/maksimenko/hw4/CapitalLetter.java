import java.util.Scanner;


public class CapitalLetter {

    public static void main(String[] args) {
    String abc;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите текст латинскими буквами:");
    abc=scanner.nextLine();
    System.out.print("Измененная строка: ");

    UpperCase(abc);
    }

    static void UpperCase(String abc) {
        String words[] = abc.split(" ");
        for(String word : words){
            String abc2;
            abc2 = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.print(abc2+ " ");
        }
    }
    
}


import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            int lengthBannedWord = word.length();
                text = text.replace(word, repeat("*", lengthBannedWord));
        }
        System.out.println(text);

    }
    public static String repeat (String word, int count){
        String[] repeatedArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatedArr[i] = word;
        }
        return String.join("", repeatedArr);
    }
}

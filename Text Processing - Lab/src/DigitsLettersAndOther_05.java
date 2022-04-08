import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        char[] chars = line.toCharArray();
        for (char aChar : chars) {

            if(Character.isDigit(aChar)) {
                digits.append(aChar);
            } else if (Character.isLetter(aChar)){
                letters.append(aChar);
            } else {
                symbols.append(aChar);
            }
        }
        for (int i = 0; i < digits.length(); i++) {
            System.out.print(digits.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < letters.length(); i++) {
            System.out.print(letters.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < symbols.length(); i++) {
            System.out.print(symbols.charAt(i));
        }

    }
}

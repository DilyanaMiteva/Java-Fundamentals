import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quality>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quality = Integer.parseInt(matcher.group("quality"));
                double price = Double.parseDouble(matcher.group("price"));

                double totalPrice = quality * price;

                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
                totalIncome += totalPrice;
                totalPrice = 0;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);

    }
}

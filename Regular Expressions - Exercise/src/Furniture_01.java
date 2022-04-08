import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quality>\\d+)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0;
        List<String> allFurniture = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {

                String furniture = matcher.group("furniture");
                allFurniture.add(furniture);
                double price = Double.parseDouble(matcher.group("price"));
                int quality = Integer.parseInt(matcher.group("quality"));

                totalPrice += (price * quality);

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        allFurniture.forEach(f -> System.out.println(f));
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}

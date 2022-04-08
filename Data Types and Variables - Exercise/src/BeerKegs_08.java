import java.util.Scanner;
public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfInput = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String theBiggerKeg = "";
        for (int i = 0; i < countOfInput; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * radius * radius * height;
            if(currentVolume > maxVolume){
                maxVolume = currentVolume;
                theBiggerKeg = model;
            }
        }
        System.out.println(theBiggerKeg);
    }
}
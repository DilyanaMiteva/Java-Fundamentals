import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesAndQuality = new LinkedHashMap<>();

        String input = scanner.nextLine();
        int quality = 0;

        while (!input.equals("stop")){
            int currentQuality = Integer.parseInt(scanner.nextLine());
            if (resourcesAndQuality.containsKey(input)){
                int val = resourcesAndQuality.get(input);
                resourcesAndQuality.put(input, val += currentQuality);
            } else {
                resourcesAndQuality.put(input, quality + currentQuality);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesAndQuality.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

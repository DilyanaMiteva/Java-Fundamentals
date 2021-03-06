import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, ArrayList<String>> companies = new TreeMap<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split(" -> ");
            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = tokens[i].trim();
            }
            String company = tokens[0];
            String id = tokens[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<String>());
            }
            if (companies.containsKey(company) && !companies.get(company).contains(id)) {
                companies.get(company).add(id);
            }
            command = scanner.nextLine();
        }
        for (var entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (String ids : entry.getValue()) {
                System.out.println("-- "+ ids);
            }
        }
    }
}

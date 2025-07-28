import animal.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Barn class - Main class that manages animals in the barn
 * This class demonstrates inheritance by working with different animal types
 * Includes bonus features: names, sorting, and statistics
 */
public class Barn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();

        System.out.print("How many animals in the barn? ");
        int numAnimals = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input phase - collect information about each animal
        for (int i = 1; i <= numAnimals; i++) {
            System.out.print("Enter animal #" + i + " type (cow/chicken): ");
            String animalType = scanner.nextLine().toLowerCase().trim();

            if (animalType.equals("cow")) {
                System.out.print("Enter name for cow: ");
                String name = scanner.nextLine();
                System.out.print("Enter milk per day for cow: ");
                int milkPerDay = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Cow cow = new Cow(name, milkPerDay);
                cows.add(cow);

            } else if (animalType.equals("chicken")) {
                System.out.print("Enter name for chicken: ");
                String name = scanner.nextLine();
                System.out.print("Enter egg color for chicken: ");
                String eggColor = scanner.nextLine();

                Chicken chicken = new Chicken(name, eggColor);
                chickens.add(chicken);

            } else {
                System.out.println("Invalid animal type. Please enter 'cow' or 'chicken'.");
                i--; // Decrement counter to retry this animal
            }
        }

        // BONUS CHALLENGE 2: Sort animals alphabetically by name
        Collections.sort(cows, Comparator.comparing(Animal::getName));
        Collections.sort(chickens, Comparator.comparing(Animal::getName));

        // Output phase - display all animals
        System.out.println();

        // Display all cows
        if (!cows.isEmpty()) {
            System.out.println("--- All Cows (sorted by name) ---");
            for (Cow cow : cows) {
                System.out.println("Name: " + cow.getName() + ", Type: " + cow.getType() + ", Milk per day: "
                        + cow.getMilkPerDay() + "L");
            }
            System.out.println();
        }

        // Display all chickens
        if (!chickens.isEmpty()) {
            System.out.println("--- All Chickens (sorted by name) ---");
            for (Chicken chicken : chickens) {
                System.out.println("Name: " + chicken.getName() + ", Type: " + chicken.getType() + ", Egg Color: "
                        + chicken.getEggColor());
            }
            System.out.println();
        }

        // BONUS CHALLENGE 3: Statistics
        displayStatistics(cows, chickens);

        scanner.close();
    }

    /**
     * Display statistics for the barn animals
     * 
     * @param cows     List of cows in the barn
     * @param chickens List of chickens in the barn
     */
    private static void displayStatistics(ArrayList<Cow> cows, ArrayList<Chicken> chickens) {
        System.out.println("--- Barn Statistics ---");

        // Total milk production from all cows
        if (!cows.isEmpty()) {
            int totalMilk = 0;
            for (Cow cow : cows) {
                totalMilk += cow.getMilkPerDay();
            }
            System.out.println("Total milk production per day: " + totalMilk + "L from " + cows.size() + " cow(s)");
        }

        // Unique egg colors from all chickens
        if (!chickens.isEmpty()) {
            Set<String> uniqueEggColors = new HashSet<>();
            for (Chicken chicken : chickens) {
                uniqueEggColors.add(chicken.getEggColor().toLowerCase());
            }
            System.out.println("Unique egg colors: " + uniqueEggColors + " from " + chickens.size() + " chicken(s)");
        }

        System.out.println("Total animals in barn: " + (cows.size() + chickens.size()));
    }
}

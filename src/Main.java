import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimulationEngine engine = new SimulationEngine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Thought Process Simulation Engine!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Agent");
            System.out.println("2. Run Scenario");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter agent name: ");
                String name = scanner.nextLine();
                System.out.print("Enter base score: ");
                int score = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Choose strategy (1=Logic, 2=Impulse, 3=Experience): ");
                int strat = scanner.nextInt();
                scanner.nextLine();
                InfluenceStrategy strategy = new LogicalStrategy();
                if (strat == 2) strategy = new ImpulseStrategy();
                else if (strat == 3) strategy = new ExperienceStrategy();
                ThoughtAgent agent = new ThoughtAgent(name, score, strategy);
                engine.getAgentManager().addAgent(agent);
            } else if (choice == 2) {
                engine.runScenario();
            } else {
                break;
            }
        }

        scanner.close();
    }
}


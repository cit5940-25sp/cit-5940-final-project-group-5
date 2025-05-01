import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimulationEngine engine = new SimulationEngine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Thought Process Simulation Engine!");

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add Agent");
            System.out.println("2. Run Scenario");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            // Read the user's menu choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Prompt user to enter details for a new agent
                System.out.print("Enter agent name: ");
                String name = scanner.nextLine();
                System.out.print("Enter base score: ");
                int score = scanner.nextInt();
                scanner.nextLine();

                // Ask for strategy type
                System.out.print("Choose strategy (1=Logic, 2=Impulse, 3=Experience): ");
                int strat = scanner.nextInt();
                scanner.nextLine();

                // Instantiate appropriate strategy based on user input
                InfluenceStrategy strategy = new LogicalStrategy();
                if (strat == 2) strategy = new ImpulseStrategy();
                else if (strat == 3) strategy = new ExperienceStrategy();

                // Create a new agent with the given parameters
                ThoughtAgent agent = new ThoughtAgent(name, score, strategy);

                // Add the new agent to the simulation engine's agent manager
                engine.getAgentManager().addAgent(agent);
            } else if (choice == 2) {
                // Run the predefined simulation scenario
                engine.runScenario();
            } else {
                break;
            }
        }

        scanner.close();
    }
}


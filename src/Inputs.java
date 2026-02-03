public class Inputs {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Choose a question:");
        System.out.println("1. Cylinder volume");
        System.out.println("2. Personalized greeting");
        System.out.println("3. Concatenate 5 strings");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();

            System.out.print("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();

            double volume = Math.PI * radius * radius * height;
            System.out.println("The volume of the cylinder is: " + volume);
        } else if (choice == 2) {
            System.out.print("Hello, who are you? ");
            String name = scanner.nextLine();

            System.out.println("Hello, " + name + ". It is good to meet you.");
        } else if (choice == 3) {
            String combined = "";
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter string value " + i + ": ");
                String value = scanner.nextLine();
                combined += value;
            }

            System.out.println("Concatenated string: " + combined);
            System.out.println("Number of characters: " + combined.length());
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

public class Inputs {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }
}

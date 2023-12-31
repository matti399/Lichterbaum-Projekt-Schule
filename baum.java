import java.util.Scanner;

public class baum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopper = false;
        int days;

        do {
            System.out.println("Geben Sie den Tag ein (0-24):");
            days = scanner.nextInt();

            if (days >= 0 && days <= 24) {
                drawChristmasTree(days);
                stopper = true;
            } else {
                System.out.println("Ungültige Eingabe. Der Tag muss zwischen 0 und 24 liegen.");
            }
        } while (!stopper);
    }

    private static void drawChristmasTree(int days) {
        //Kerzen Oben
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < days; j++) {
                System.out.print(" ");
            }
            System.out.println("ii");
        }

        for (int i = 0; i < days; i++) {
            // Leerzeichen für die Ausrichtung
            for (int j = 0; j < days - i - 1; j++) {
                System.out.print(" ");
            }
            // Forwardslash für die linke Umrandung
            System.out.print("i/");
            // Sterne für den Baum
            for (int k = 0; k < i; k++) {
                System.out.print("*o");
            }
            // Backslash für die rechte Umrandung
            System.out.println("\\i");
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < days * 2 + 1; j++) {
                System.out.print('-');
            }
            System.out.println("-");
        }

        // Stamm des Baums
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < days; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
}

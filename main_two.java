import java.util.Scanner;

public class main_two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Tag (0-24):");
        int height = scanner.nextInt();

        if (height >= 0 && height <= 24) {
            drawChristmasTree(height);
        } else {
            System.out.println("Ungültige Eingabe. Der Tag muss zwischen 0 und 24 liegen.");
        }
    }

    private static void drawChristmasTree(int height) {
        //kerzen Oben
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("ii");
        }

        for (int i = 0; i < height; i++) {
            // Leerzeichen für die Ausrichtung
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Backslash für die linke Umrandung
            System.out.print("i/");
            // Sterne für den Baum
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Forwardslash für die rechte Umrandung
            System.out.println("\\i");
        }

        // Stamm des Baums
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
}
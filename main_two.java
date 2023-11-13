import java.util.Scanner;

public class main_two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Höhe des Weihnachtsbaums (0-24) ein:");
        int height = scanner.nextInt();

        if (height >= 0 && height <= 24) {
            drawChristmasTree(height);
        } else {
            System.out.println("Ungültige Eingabe. Die Höhe muss zwischen 0 und 24 liegen.");
        }
    }

    private static void drawChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            // Leerzeichen für die Ausrichtung
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Backslash für die linke Umrandung
            System.out.print("\\");
            // Sterne für den Baum
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Forwardslash für die rechte Umrandung
            System.out.println("/");
        }

        // Stamm des Baums
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
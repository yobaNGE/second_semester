package l10_P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        scanner.close();
        System.out.println("Surface Area: " + box.calculateSurfaceArea());
        System.out.println("Lateral Surface Area: " + box.calculateLateralSurfaceArea());
        System.out.println("Volume: " + box.calculateVolume());
    }
}

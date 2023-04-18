package l11_P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box11 box = new Box11(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        scanner.close();
        box.calculateAll();
    }
}

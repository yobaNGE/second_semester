package l11_P2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle(scanner.nextDouble(),scanner.nextDouble(), scanner.nextDouble());
        scanner.close();
        triangle.calculateAll();
        System.out.println("aaaa");
    }
}

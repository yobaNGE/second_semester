package l10_P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(scanner.next(), scanner.next(), scanner.nextInt());
        }
        scanner.close();
        for (Car car : cars) {
            car.getInfo();
        }
    }
}

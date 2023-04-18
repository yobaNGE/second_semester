package l10_P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Person[] pepoles = new Person[n];
        for (int i = 0; i < n; i++) {
            pepoles[i] = new Person(scanner.next(), scanner.nextInt());
        }
        scanner.close();
        for (Person person : pepoles) {
            if (person.getAge() > 17) {
                person.getInfo();
            }
        }
    }
}

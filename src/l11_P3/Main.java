package l11_P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chicken chicken = new Chicken(sc.next(), Integer.parseInt(sc.next()));
        System.out.println(chicken.showInfo());
    }
}

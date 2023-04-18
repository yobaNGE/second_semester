package l11_P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++)
            Lamb.createLamb(sc.next());
        System.out.println(Lamb.printCount());
    }

}

package l10_P4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Enter command: ");
            command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            switch (commandParts[0].toLowerCase()) {
                case "create":
                    if (accounts.size() < 100) {
                        BankAccount account = new BankAccount();
                        accounts.add(account);
                        System.out.println("Account created with ID: " + account.getId());
                    } else {
                        System.out.println("Too low! Terrain!");
                    }
                    break;
                case "deposit":
                    int id = Integer.parseInt(commandParts[1]);
                    double amount = Double.parseDouble(commandParts[2]);
                    BankAccount account = findAccount(id);
                    if (account != null) {
                        account.deposit(amount);
                        System.out.println(amount + " deposited " + id);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "setinterest":
                    double interestRate = Double.parseDouble(commandParts[1]);
                    BankAccount.setInterestRate(interestRate);
                    System.out.println("Interest set to " + interestRate);
                    break;
                case "getinterest":
                    id = Integer.parseInt(commandParts[1]);
                    int years = Integer.parseInt(commandParts[2]);
                    account = findAccount(id);
                    if (account != null) {
                        double interest = account.getInterestRate(years);
                        System.out.println("Interest on account " + id + " after " + years + " years: " + interest);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "end":
                    System.out.println("Я хочу питсы");
                    break;
                default:
                    System.out.println("No such command.");
                    break;
            }
        } while (!command.equalsIgnoreCase("end"));
        scanner.close();
    }

    private static BankAccount findAccount(int id) {
        for (BankAccount account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }
}

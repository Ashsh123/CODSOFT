
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exchange rates
        final double USD_TO_EUR = 0.85;
        final double USD_TO_INR = 74.50;
        final double EUR_TO_USD = 1.18;
        final double EUR_TO_INR = 87.50;
        final double INR_TO_USD = 0.013;
        final double INR_TO_EUR = 0.011;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Choose the currency you want to convert from:");
        System.out.println("1. US Dollars (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Indian Rupees (INR)");
        
        int choiceFrom = scanner.nextInt();
        
        System.out.println("Choose the currency you want to convert to:");
        System.out.println("1. US Dollars (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Indian Rupees (INR)");
        
        int choiceTo = scanner.nextInt();
        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        
        double convertedAmount = 0;

        // Conversion logic
        if (choiceFrom == 1 && choiceTo == 2) {
            convertedAmount = amount * USD_TO_EUR;
            System.out.printf("%.2f USD is %.2f EUR%n", amount, convertedAmount);
        } else if (choiceFrom == 1 && choiceTo == 3) {
            convertedAmount = amount * USD_TO_INR;
            System.out.printf("%.2f USD is %.2f INR%n", amount, convertedAmount);
        } else if (choiceFrom == 2 && choiceTo == 1) {
            convertedAmount = amount * EUR_TO_USD;
            System.out.printf("%.2f EUR is %.2f USD%n", amount, convertedAmount);
        } else if (choiceFrom == 2 && choiceTo == 3) {
            convertedAmount = amount * EUR_TO_INR;
            System.out.printf("%.2f EUR is %.2f INR%n", amount, convertedAmount);
        } else if (choiceFrom == 3 && choiceTo == 1) {
            convertedAmount = amount * INR_TO_USD;
            System.out.printf("%.2f INR is %.2f USD%n", amount, convertedAmount);
        } else if (choiceFrom == 3 && choiceTo == 2) {
            convertedAmount = amount * INR_TO_EUR;
            System.out.printf("%.2f INR is %.2f EUR%n", amount, convertedAmount);
        } else {
            System.out.println("Invalid currency selection.");
        }

        scanner.close();
    }
}
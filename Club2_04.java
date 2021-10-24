package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class Club2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiredProfit = Double.parseDouble(scanner.nextLine());
        double sumTotal = 0;
        boolean isProfit = false;

        String cocktail = scanner.nextLine();
        while (!cocktail.equals("Party!")) {
            int countCocktails = Integer.parseInt(scanner.nextLine());
            double price = cocktail.length();
            double priceQuantity = price * countCocktails;
            if (priceQuantity % 2 != 0) {
                priceQuantity = priceQuantity * 0.75;
            }
            sumTotal += priceQuantity;
            if (sumTotal >= desiredProfit) {
                System.out.println("Target acquired.");
                isProfit = true;
                break;
            }
            cocktail = scanner.nextLine();
        }
        double diff = Math.abs(desiredProfit - sumTotal);
        if (!isProfit) {
            System.out.printf("We need %.2f leva more.%n", diff);
        }
        System.out.printf("Club income - %.2f leva.", sumTotal);

    }
}

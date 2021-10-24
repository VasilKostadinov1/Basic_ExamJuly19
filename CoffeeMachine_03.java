package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class CoffeeMachine_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();  // Espresso", "Cappuccino" или "Tea"
        String sugar = scanner.nextLine();  // Without", "Normal" или "Extra"
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = 0.90;
                } else if (sugar.equals("Normal")) {
                    price = 1.00;
                } else if (sugar.equals("Extra")) {
                    price = 1.20;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = 1.00;
                } else if (sugar.equals("Normal")) {
                    price = 1.20;
                } else if (sugar.equals("Extra")) {
                    price = 1.60;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = 0.50;
                } else if (sugar.equals("Normal")) {
                    price = 0.60;
                } else if (sugar.equals("Extra")) {
                    price = 0.70;
                }
                break;
        }
        double total = price * count;
        if (sugar.equals("Without")) {
            total = total * 0.65;
        }
        if (drink.equals("Espresso") && count >= 5) {  //напитка "Espresso" и закупени поне 5 броя, има 25% отстъпка.
            double discount = total * 0.25;
            total = total * 0.75;
        }
        if (total > 15) {       // only > ;	При сума надвишава 15 лева, 20% отстъпка от крайната цена
            total = total * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", count, drink, total);


    }
}

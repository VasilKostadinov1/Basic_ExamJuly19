package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (nights>7){
            priceNight=priceNight*0.95;
        }
        double totalSpent = nights*priceNight;
        double addSpends =percent*budget/100;
        double totalTotal = totalSpent+addSpends;
        if (budget>=totalTotal){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",Math.abs(budget-totalTotal));
        }else {
            System.out.printf("%.2f leva needed.",Math.abs(budget-totalTotal));
        }


    }



}

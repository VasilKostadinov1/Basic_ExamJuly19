package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desiredProfit = Double.parseDouble(scanner.nextLine());

        String nameCocktail = scanner.nextLine();
        double totalPerCocktail = 0;
        double totalAll=0;              // all cocktails sum also needed!

        while (!nameCocktail.equals("Party!")) {
            int countCocktails = Integer.parseInt(scanner.nextLine());
            int priceCocktail = nameCocktail.length();   //цената на един коктейл е дължината неговото име
            totalPerCocktail = countCocktails * priceCocktail;

            if (totalPerCocktail % 2 != 0) {       //Ако цената на една поръчка е нечетно число, има 25% отстъпка от цената на поръчката.
                totalPerCocktail = totalPerCocktail * 0.75;
            }
            totalAll+=totalPerCocktail;       // all cocktails sum also needed!

            if (totalAll>=desiredProfit ){            //•	При достигане на желаната печалба
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.",totalAll);
                break;                              // !!! or 40/100 !!!
            }
            nameCocktail = scanner.nextLine();
        }
        if (totalAll<desiredProfit){
            double diff = Math.abs(desiredProfit-totalAll);
            System.out.printf("We need %.2f leva more.%n",diff);
            System.out.printf("Club income - %.2f leva.",totalAll);
        }




    }

}

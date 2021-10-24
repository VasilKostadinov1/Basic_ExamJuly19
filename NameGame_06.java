package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           // 90/100  ?печели този, който втори е достигнал резултата
        String name = scanner.nextLine();

        int sum = 0;
        String bestName = "";
        int max = Integer.MIN_VALUE;

        while (!name.equals("Stop")) {           //за всяка една буква от името си написва по едно цяло число -> FOR LOOP
            for (int i = 0; i <= name.length() - 1; i++) {          // -1 !!!, otherwise -> exception
                int n = Integer.parseInt(scanner.nextLine());
                if (n == name.charAt(i)) {         //ако числото съвпада с ASCII стойността на съответната буква
                    sum += 10;
                } else {
                    sum += 2;
                }
            }
            if (sum >= max) {      // "if" to be out of the For, otherwise we are ZERO-ing previous numbers of 1 player
                max = sum;
                bestName = name;
                sum = 0;            // !!! нулираме сумата на Иван, и продължаваме с Иво
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", bestName, max);
    }
}


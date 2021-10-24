package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class TheMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //solved by Milipt

        String command = scanner.nextLine();
        String word = "";
        int maxSum = Integer.MIN_VALUE;

        while (!command.equals("End of words")) {
            word = command;
            int currentSum = 0;
            boolean check = false;

            for (int i = 0; i < command.length(); i++) {
                char current = command.charAt(i);

                currentSum += current;
                boolean isVowel = current == 'a' || current == 'o' || current == 'e' || current == 'i' || current == 'u' || current == 'y'
                        || current == 'A' || current == 'O' || current == 'E' || current == 'I' || current == 'U' || current == 'Y';
                if (i == 0 && isVowel) {   //  започва с гласна буква - 'a', 'e', 'i', 'o', 'u', 'y'
                    check = true;
                }
            }
            if (check) {              //полученият сбор трябва да се умножи по дължината на думата
                currentSum = currentSum * command.length();
            } else {                 //в противен случай, да се раздели на дължината
                currentSum = currentSum / command.length();
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                word = command;      //!!!
            }
            command = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", word, maxSum);

    }
}

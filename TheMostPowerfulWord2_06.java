package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class TheMostPowerfulWord2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //  60/100 mine solution
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String word = "";
        boolean check = false;
        //int sum = 0;  If declared here, sum should be Zero-ed at the end, after each word!!!

        while (!input.equals("End of words")) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                sum += symbol;
                boolean isVowelStart = (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o'
                        || input.charAt(0) == 'u' || input.charAt(0) == 'y' || input.charAt(0) == 'A' || input.charAt(0) == 'E' ||
                        input.charAt(0) == 'I' || input.charAt(0) == 'O' || input.charAt(0) == 'U' || input.charAt(0) == 'Y');
                if (isVowelStart) {
                    check = true;
                }
            }
            if (check) {    // out of the For !!! as: полученият сбор трябва да се умножи по дължината на думата
                sum = sum * input.length();
            } else {                         //в противен случай, да се раздели на дължината
                sum = (sum / input.length());
            }
            if (sum > max) {
                max = sum;
                word=input;
            }
           // word = input;  if equalized here, input will be the last word
            //sum=0;  if sum is declared outside the While, then it should be zero-ed after each word!!!
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", word, max);


    }
}

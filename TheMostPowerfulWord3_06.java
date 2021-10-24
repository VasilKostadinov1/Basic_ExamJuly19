package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class TheMostPowerfulWord3_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // by Manekena

        String text = scanner.nextLine();

        double totalSum = -200000000;  //
        String winner = "";

        while (!text.equals("End of words")) {
            double sum = 0;
            for (int i = 0; i < text.length(); i++) {
                char num = text.charAt(i); // int num=...
                sum += num;
            }
            char b = text.charAt(0);   //!! if(b==) should be out of the For, as we want to "* or /"  the sum based on 1 word only
            if (b == 'a' || b == 'A' || b == 'e' || b == 'E' || b == 'o' || b == 'O' || b == 'u'
                    || b == 'U' || b == 'i' || b == 'I' || b == 'y' || b == 'Y') {
                sum *= text.length();
            } else {
                sum = Math.floor(sum / text.length());
            }
            if (sum > totalSum) {
                totalSum = sum;
                winner = text;
            }
            text = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", winner, totalSum);
    }
}

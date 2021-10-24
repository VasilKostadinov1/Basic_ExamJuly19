package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class PCGameShop2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countH = 0;
        int countF = 0;
        int countO = 0;
        int countOthers = 0;
        int countTotal = 0;

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            switch (name) {
                case "Hearthstone":
                    countH++;

                    break;
                case "Fornite":
                    countF++;

                    break;
                case "Overwatch":
                    countO++;

                    break;
                default:
                    countOthers++;

                    break;
            }
            countTotal++;
        }
        System.out.printf("Hearthstone - %.2f%%%n",countH*100.00/countTotal);
        System.out.printf("Fornite - %.2f%%%n",countF*100.00/countTotal);
        System.out.printf("Overwatch - %.2f%%%n",countO*100.00/countTotal);
        System.out.printf("Others - %.2f%%%n",countOthers*100.00/countTotal);

    }
}

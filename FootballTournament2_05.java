package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class FootballTournament2_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // not a difficult problem
        String name = scanner.nextLine();
        int countGames = Integer.parseInt(scanner.nextLine());
        int countTotalGames=0;
        int countWin=0;
        int countLose=0;
        int countDraw=0;
        int points=0;

        for (int i = 1; i <=countGames ; i++) {
            String result = scanner.nextLine();  //'W', 'D' и 'L'
            if (result.equals("W")){
                countWin++;
                points+=3;
            }else if (result.equals("D")){
                countDraw++;
                points+=1;
            }else {
                countLose++;
            }
            countTotalGames++;
        }
        if (countTotalGames==0){
            System.out.printf("%s hasn't played any games during this season.",name);
        }else {
            System.out.printf("%s has won %d points during this season.%n",name,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",countWin);
            System.out.printf("## D: %d%n",countDraw);
            System.out.printf("## L: %d%n",countLose);
            System.out.printf("Win rate: %.2f%%",countWin*100.00/countGames);
        }


    }
}

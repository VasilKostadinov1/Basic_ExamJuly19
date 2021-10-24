package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentForPaint = Integer.parseInt(scanner.nextLine());

        int area = height * width * 4;
        double areaLessPercent = Math.ceil(area - (double)(area * percentForPaint / 100));  //Площта за боядисване да бъде закръглена нагоре
        String command = scanner.nextLine();
        int sumLitres = 0;

        while (!command.equals("Tired!") || areaLessPercent<0) {   //до получаване на командата "Tired!" или
            int litres = Integer.parseInt(command);   // !! command
            areaLessPercent -= litres;
             sumLitres += litres;

            if (areaLessPercent<=0){  // !!! или докато не бъдат боядисани всички стени !!! break !!!
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Tired!")) {               //•	При получаване на командата "Tired!":
            System.out.printf("%.0f quadratic m left.%n", areaLessPercent);
        }
        else if (sumLitres==0){                        //не е останала боя
            System.out.println("All walls are painted! Great job, Pesho!");
        }else {                                       //останала боя в излишък:
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(areaLessPercent));
        }


    }
}

package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class NameGame2_06 {
    public static void main(String[] args) {    //100/100  печели този, който втори е достигнал резултата
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int max=Integer.MIN_VALUE;
        String maxName="";
        int sum=0;
        int total=0;  //печели този, който втори е достигнал резултата->add.counter added in order to Zero the rezult of the 1st

        while (!name.equals("Stop")){
            for (int i = 0; i <name.length() ; i++) {
                int count = Integer.parseInt(scanner.nextLine());
                if (count==name.charAt(i)){
                    sum+=10;
                }else {
                    sum+=2;
                }
                total+=sum;
                sum=0;
            }
            if (total>=max){
                max=total;
                maxName=name;
            }
            total=0;   //печели този, който втори е достигнал резултата
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",maxName,max);
    }
}

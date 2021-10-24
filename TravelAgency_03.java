package BASIC.Additional_Problems_MIX.ExamPrepJuly19;

import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();  // Bansko",  "Borovets", "Varna" или "Burgas")
        String type = scanner.nextLine();  // noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        String vip = scanner.nextLine();  //  yes" или "no"
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (days > 7) {
            days = days - 1;
        }
        if (days < 1) {
            System.out.println("Days must be positive number!");
        }

        switch (town) {
            case "Bansko":
            case "Borovets":
                if (type.equals("withEquipment")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price * 0.90;
                    }else if (vip.equals("no")) {
                        price = price ;
                    }

                } else if (type.equals("noEquipment")) {
                    price = 80;
                    if (vip.equals("yes")) {
                        price = price * 0.95;
                    }else if (vip.equals("no")) {
                        price = price ;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (type.equals("withBreakfast")) {
                    price = 130;
                    if (vip.equals("yes")) {
                        price = price * 0.88;
                    }else if (vip.equals("no")) {
                        price = price ;
                    }
                } else if (type.equals("noBreakfast")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price * 0.93;
                    }else if (vip.equals("no")) {
                        price = price ;
                    }
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        if (!vip.equals("no") && !vip.equals("yes")) {
            System.out.println("Invalid input!");
        }
        double total = price * days;
        if ((town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas")) && days > 1) {
            System.out.printf("The price is %.2flv! Have a nice time!", total);
        }


    }
}

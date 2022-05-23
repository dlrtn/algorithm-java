package zeroBaseFirstAndSecondWeeks.JavaStudy03;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = scan.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int entryTime = scan.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n)");
        String personNationalMerit = scan.next();

        System.out.print("복지카드 여부를 입력해 주세요(y/n):");
        String welfareCardStatus = scan.next();

        int price = 10000;
        if (age < 3) {
            price = 0;
        }
        else if (personNationalMerit.equals("y") || welfareCardStatus.equals("y")) {
            price *= 0.8;
        }
        else if (age < 13) {
            price *= 0.4;
        }
        else if (entryTime >= 17) {
            price *= 0.4;
        }

        System.out.print("입장료: " + price);

    }

}


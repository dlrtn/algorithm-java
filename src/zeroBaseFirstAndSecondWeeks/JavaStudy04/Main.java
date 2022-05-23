package zeroBaseFirstAndSecondWeeks.JavaStudy04;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        String frontSeat = new String();
        String backSeat = new String();

        System.out.println("[입장권 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int yearBirth = scan.nextInt();

        System.out.print("출생월을 입력해 주세요.(mm):");
        int monthBirth = scan.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int dateBirth = scan.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f)");
        String gender = scan.next();

        frontSeat += Integer.toString(yearBirth) + Integer.toString(monthBirth) + Integer.toString(dateBirth);
        backSeat += Integer.toString((gender.equals("m")) ? 3 : 4) + Integer.toString(rand.nextInt(1000000));

        System.out.print(frontSeat + "-" + backSeat);

    }

}


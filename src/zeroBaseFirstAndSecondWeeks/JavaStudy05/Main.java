package zeroBaseFirstAndSecondWeeks.JavaStudy05;

import java.util.*;

public class Main { //주익수

    static Calendar  cal = Calendar.getInstance();
    static Scanner  sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("[달력 출력 프로그램]");

        System.out.print("달력의 년도를 입력해 주세요(yyyy):");
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);

        System.out.println();
        System.out.println();

        System.out.println("[" + year + "년 " + month + "월]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        cal.set(year, month - 1, 1);

        int end = cal.getActualMaximum(Calendar.DATE);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i <= end; i++) {
            if (i == 1) {
                for (int j = 1; j < dayOfWeek; j++) {
                    System.out.print("\t");
                }
            }
            System.out.print(String.format("%02d", i) + "\t");
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
            dayOfWeek++;
        }
    }
}
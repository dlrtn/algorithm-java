package zeroBaseFirstAndSecondWeeks.JavaStudy08;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] income = new int[8];

        int[] standardAssessment = {12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000, 0};
        int[] standardAssessmentDifference = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000, 0};
        int[] taxRate = {6, 15, 24, 35, 38, 40, 42, 45};
        int[] deduction = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");

        int annualIncome = scan.nextInt();

        income[0] = annualIncome;

        for (int i = 0; i < 7; i++) {
            if (income[i] > standardAssessmentDifference[i]) {
                int a = income[i] - standardAssessmentDifference[i];
                income[i] = standardAssessmentDifference[i];
                income[i + 1] = a;
            } else {
            }
        }

        int taxCount = 0;
        for (int i = 0; i < 8; i++) {
            if (income[i] == 0) {
            } else {
                int taxRateIncome = income[i] / 100 * taxRate[i];
                System.out.print(String.format("%10d * %2d", income[i], taxRate[i]));
                System.out.print("% = ");
                System.out.printf("%10d\n", taxRateIncome);
                taxCount = taxCount + taxRateIncome;
            }
        }

        int answer = 0;

        for (int i = 0; i < 8; i++) {
            if (annualIncome < standardAssessment[i]) {
                answer = annualIncome / 100 * taxRate[i] - deduction[i];
                break;
            } else if (annualIncome > 1000000000) {
                i = 7;
                answer = annualIncome / 100 * taxRate[i] - deduction[i];
                break;
            } else {
            }
        }
        System.out.println();
        System.out.print("[세율에 의한 세금]:");
        System.out.println(String.format("\t\t %10d", taxCount));
        System.out.print("[누진 공제 계산에 의한 세금]:");
        System.out.println(String.format("%10d", answer));

    }

}

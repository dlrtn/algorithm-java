package zeroBaseFirstAndSecondWeeks.JavaStudy07;

import java.util.*;

public class Main { //주익수

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("[로또 당첨 프로그램]");
        System.out.println("");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int lottoCount = sc.nextInt();

        int number[][] = new int[lottoCount + 1][6];


        for (int i = 0; i < lottoCount + 1; i++) {
            int idx = 0;
            while (true) {
                int zero = 0;
                for (int j = 0; j < number[i].length; j++) {
                    if (number[i][j] == 0)
                        zero++;
                }
                if (zero <= 0)
                    break;
                else {
                    int random_number = random.nextInt(45) + 1;
                    int check = 0;

                    for (int k = 0; k < number.length; k++) {
                        if (number[i][k] == random_number)
                            check++;
                    }

                    if (check <= 0) {
                        number[i][idx] = random_number;
                        idx++;
                    }
                }
            }
        }
        for (int i = 0; i < lottoCount; i++) {
            bubble_sort(number[i]);
            System.out.print(String.format("%c\t", 65 + i));
            for (int j = 0; j < 6; j++) {
                System.out.print(String.format("%02d ", number[i][j]));
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("[로또 발표]");
        System.out.print("\t");
        bubble_sort(number[lottoCount]);
        for (int j = 0; j < 6; j++) {
            System.out.print(String.format("%02d ", number[lottoCount][j]));
        }
        System.out.println();
        System.out.println();

        System.out.println("[내 로또 결과]");
        int sameCount[] = new int[lottoCount];

        for (int i = 0; i < lottoCount; i++) {
            sameCount[i] = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (number[lottoCount][j] == number[i][k])
                        sameCount[i]++;
                }
            }
        }

        for (int i = 0; i < lottoCount; i++) {
            System.out.print(String.format("%c\t", 65 + i));
            for (int j = 0; j < 6; j++) {
                System.out.print(String.format("%02d ", number[i][j]));
            }
            System.out.println(String.format("=> %d개 일치", sameCount[i]));
        }
    }

    public static void bubble_sort(int[] a) {
        bubble_sort(a, a.length);
    }

    private static void bubble_sort(int[] a, int size) {

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
/*
주익수
*/
package zeroBaseFirstAndSecondWeeks.JavaStudy06;

import java.util.Random;
import java.util.Scanner;

public class Main { //주익수

    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    static String[] presidentialCandidate = {"이재명", "윤석열", "심상정", "안철수"};
    static int[] presidentialCandidateCount = {0, 0, 0, 0};

    public static void main(String[] args) {

        int max = 0;

        for (int i = 1; i <= 10000; i++) {

            int temp = rand.nextInt(4);

            presidentialCandidateCount[temp]++;
            if (max < presidentialCandidateCount[temp])
                max = presidentialCandidateCount[temp];

            System.out.println("[투표진행율]: " + String.format("%.2f", ((double) i / 10000) * 100) + "%, " + i + "명 투표 => " + presidentialCandidate[temp]);
            System.out.println("[기호:1] 이재명: " + String.format("%.2f", ((double) presidentialCandidateCount[0] / i * 100)) + "%" + ", (투표수: " + presidentialCandidateCount[0] + ")");
            System.out.println("[기호:2] 윤석열: " + String.format("%.2f", ((double) presidentialCandidateCount[1] / i * 100)) + "%" + ", (투표수: " + presidentialCandidateCount[1] + ")");
            System.out.println("[기호:3] 심상정: " + String.format("%.2f", ((double) presidentialCandidateCount[2] / i * 100)) + "%" + ", (투표수: " + presidentialCandidateCount[2] + ")");
            System.out.println("[기호:4] 안철수: " + String.format("%.2f", ((double) presidentialCandidateCount[3] / i * 100)) + "%" + ", (투표수: " + presidentialCandidateCount[3] + ")");

        }

        int index = 0;

        for (int i = 0; i < 4; i++) {
            if (presidentialCandidateCount[i] == max)
                index = i;
        }

        System.out.println("[투표결과] 당선인: " + presidentialCandidate[index]);

    }
}
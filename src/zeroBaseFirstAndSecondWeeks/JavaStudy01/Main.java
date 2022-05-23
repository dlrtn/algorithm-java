package zeroBaseFirstAndSecondWeeks.JavaStudy01;

public class Main {

    public static void main(String[] args) {

        System.out.println("[구구단 출력]");

        for (int i = 2; i < 10; i++) {
            String string = new String();

            for (int j = 1; j < 10; j++) {
                string += String.format("%02d x %02d = %02d    ", i,j,i*j);
            }

            System.out.println(string);

        }
    }

}


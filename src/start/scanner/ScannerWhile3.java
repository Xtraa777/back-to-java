package start.scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요(0 = 종료): ");
            int num = scr.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("입력한 정수들의 합: " + sum);
    }
}

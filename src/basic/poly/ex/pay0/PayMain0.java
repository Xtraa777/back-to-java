package basic.poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption1 = sc.nextLine();
            if (payOption1.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount1 = sc.nextInt();
            sc.nextLine();

            payService.processPay(payOption1, amount1);
        }

    }
}

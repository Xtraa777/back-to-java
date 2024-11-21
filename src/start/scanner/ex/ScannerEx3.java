package start.scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scr =  new Scanner(System.in);

        String foodname;
        int foodprice, foodQuantity;

        System.out.print("음식 이름을 입력해주세요: ");
        foodname = scr.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        foodprice = scr.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        foodQuantity = scr.nextInt();

        int totalPrice = foodprice * foodQuantity;

        System.out.printf("%s %d개를 주문하셨습니다. 총 가격은 %d원 입니다.", foodname, foodQuantity, totalPrice);
    }
}

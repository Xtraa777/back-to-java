package start.array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxProduct = 10;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (productCount < maxProduct) {
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = sc.nextLine();

                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = sc.nextInt();

                        productCount++;
                        break;
                    } else {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }

                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    } else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                        }
                        break;
                    }

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

    }
}

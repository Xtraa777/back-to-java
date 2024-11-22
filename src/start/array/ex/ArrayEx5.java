package start.array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int[] nums = new int[sc.nextInt()];

        System.out.printf("%d개의 정수를 입력하세요: \n", nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        double avg = (double) total / nums.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);

    }
}

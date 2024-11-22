package start.array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");

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

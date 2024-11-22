package start.array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int[] nums = new int[sc.nextInt()];

        System.out.printf("%d개의 정수를 입력하세요: \n", nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int maxNum, minNum;
        maxNum = minNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (maxNum < nums[i]) {
                maxNum = nums[i];
            }
            if (minNum > nums[i]) {
                minNum = nums[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);

    }
}

package start.array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int[][] students = new int[sc.nextInt()][3];

        String[] sub = {"국어", "영어", "수학"};

        int[] total = new int[students.length];

        int sum = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(sub[j] + " 점수: ");
                students[i][j] = sc.nextInt();
                sum += students[i][j];
            }
            total[i] = sum;
            sum = 0;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                (i + 1) + "번 학생의 총점: " + total[i] + ", " + "평균: " + ((double) total[i] / 3));
        }

    }
}

package start.array;

public class ArrayRef2 {

    public static void main(String[] args) {
        int[] students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.printf("학생%d 점수: %d\n", i + 1, students[i]);
        }
    }
}

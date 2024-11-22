package start.array;

public class ArrayDi4 {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        int arrNum = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = arrNum++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%-3d ", arr[row][col]);
            }
            System.out.println();
        }
    }
}

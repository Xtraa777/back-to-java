package mid1.lang.wrapper.test;

import java.util.Random;

public class Lotto {

    private final Random rand = new Random();
    private int[] nums;
    private int count;

    public int[] generate() {
        nums = new int[6];
        count = 0;

        while (count < 6) {
            int num = rand.nextInt(45) + 1;

            if (isUnique(num)) {
                nums[count] = num;
                count++;
            }
        }
        return nums;
    }

    private boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if (nums[i] == num) {
                return false;
            }
        }
        return true;
    }

}

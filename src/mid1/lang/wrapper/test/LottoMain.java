package mid1.lang.wrapper.test;

public class LottoMain {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] nums = lotto.generate();

        System.out.print("로또 번호: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

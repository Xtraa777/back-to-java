package mid1.lang.String.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s: %d\n", arr[i], arr[i].length());
            result += arr[i].length();
        }

        System.out.println("sum = " + result);
    }
}

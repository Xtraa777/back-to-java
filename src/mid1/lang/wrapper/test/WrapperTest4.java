package mid1.lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer num1 = Integer.valueOf(str);
        System.out.println("integer1 = " + num1);

        int num2 = num1;
        System.out.println("intValue = " + num2);

        Integer num3 = num2;
        System.out.println("integer2 = " + num3);

    }
}
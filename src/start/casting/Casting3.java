package start.casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue start.casting=" + intValue); //출력:2147483647
        intValue = (int) maxIntOver;
        System.out.println("maxIntOver start.casting=" + intValue); //출력:-2147483648
    }
}

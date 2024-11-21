package start.casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue: " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue: " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2: " + doubleValue);

        //intValue = 10
        //doubleValue = intValue
        //doubleValue = (double) intValue //형 맞추기
        //doubleValue = (double) 10 //변수 값 읽기
        //doubleValue = 10.0 //형변환
    }
}

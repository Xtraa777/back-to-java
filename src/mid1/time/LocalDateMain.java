package mid1.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate noewDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 1, 1);
        System.out.println("오늘 날짜=" + noewDate);
        System.out.println("지정 날짜=" + ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + ofDate);
    }
}

package mid1.enumeration.ref3;

public class EnumRefMain3_3 {

    public static void main(String[] args) {
        int price = 10_000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}

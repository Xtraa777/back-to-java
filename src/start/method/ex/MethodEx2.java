package start.method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String msg = "Hello World";
        printMsg(msg, 3);
        printMsg(msg, 5);
        printMsg(msg, 7);

    }

    public static void printMsg(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }

    }
}

package basic.extends1.super1;

public class Child extends Parent{

    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello(); // this 생략가능
        super.hello();
    }
}

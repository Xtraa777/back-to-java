package mid1.lang.object;

public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod()");
    }
}

/* 같은 코드
public class Parent extends Object {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
 */
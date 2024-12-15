package mid2.generic.test.ex3;

import mid2.generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        this.unit = t;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public T out() {
        return unit;
    }
}

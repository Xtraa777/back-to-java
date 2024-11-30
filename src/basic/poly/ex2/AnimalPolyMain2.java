package basic.poly.ex2;

import basic.poly.ex1.Animal;
import basic.poly.ex1.Cat;
import basic.poly.ex1.Cow;
import basic.poly.ex1.Dog;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
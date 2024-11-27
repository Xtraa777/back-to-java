package basic.poly.ex2;

import basic.poly.ex1.Animal;
import basic.poly.ex1.Cat;
import basic.poly.ex1.Cow;
import basic.poly.ex1.Dog;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

package intellij;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
// Generics

        Printer<Cat> printOne = new Printer<>(new Cat());
        printOne.print();

        Printer<Dog> gpa = new Printer<>(new Dog());
        gpa.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Cat catOne = cats.getFirst();



    }
}
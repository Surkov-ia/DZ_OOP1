package org.example.Lesson1.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new SiberanCat();
        cat.setAge(5);

        cat.setName("murzik");

        Cat cat2 = new Cat();
        cat2.setAge(7);
        cat2.setName("musia");

        cat2.printInfo();
        cat.printInfo();

    }
}
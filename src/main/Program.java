package main;

import AbstractFactory.FourlegAnimalFactory;
import AbstractFactory.TwolegAnimalFactory;
import animal.Animal;
import animalFactory.AnimalFactory;
import animalFactory.BasicAnimalFactory;
import animalFactory.RandomAnimalFactory;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
//        AnimalFactory animalFactory;
//        Random random = new Random();
//        int type = random.nextInt(2);
//        if (type == 1) {
//            animalFactory = new FourlegAnimalFactory();
//        } else {
//            animalFactory = new Twoleg  AnimalFactory();
//        }
//
//        System.out.println(animalFactory.createAnimal().getname());
//        System.out.println(animalFactory.createAnimal().getname());
//        System.out.println(animalFactory.createAnimal().getname());
//        System.out.println(animalFactory.createAnimal().getname());
//        System.out.println(animalFactory.createAnimal().getname());

        String a = "anagramm";
        String b = "marganaa";

        int length = a.length();
        int length1 = b.length();
        if (length != length1) {
            System.out.println("False");
        } else  {
            char[] chars = a.toLowerCase().toCharArray();
            char[] chars1 = b.toLowerCase().toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars1);
            boolean equals = Arrays.equals(chars, chars1);
            System.out.println(equals);
        }



    }
}

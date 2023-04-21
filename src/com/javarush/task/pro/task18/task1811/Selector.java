package com.javarush.task.pro.task18.task1811;

import java.util.List;
import java.util.stream.Collectors;

public class Selector {
    private static List<Owner> owners;

    private static void initData(){

        final Owner owner1 = new Owner("Oleg");
        owner1.getPets().addAll(List.of(
                new Cat("Baron", Color.BLACK, 4),
                new Cat("Vasili", Color.FOXY, 5)
                ));

        final Owner owner2 = new Owner("Goga");
        owner1.getPets().addAll(List.of(
                new Cat("Varon", Color.WHITE, 4),
                new Cat("Net", Color.FOXY, 2)
        ));

        owners = List.of(owner1, owner2);

    }

    public static void main(String[] args){
        initData();

        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet ->Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.FOXY == cat.getColor())
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .map(Animal::getName)
                .collect(Collectors.toList());

        findNames.forEach(System.out::println);





    }




}

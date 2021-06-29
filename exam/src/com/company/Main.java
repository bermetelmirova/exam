package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        try {
            addPerson(new Person("Elmirova", "Bermet", "Elmirovna"), people);
            addPerson(new Person("Elmirova", "Bermet", "Elmirovna"), people);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(people);
    }

    public static void addPerson(Person person, LinkedList<Person> people) throws Exception {
        boolean isUnique = true;
        for (int i = 0; i < people.size(); i++) {
            if (person.equals(people.get(i))) {
                isUnique = false;
            }
        }
        if (isUnique) {
            people.add(person);
        } else {
            throw new Exception("Дубликат!");
        }

    }
}

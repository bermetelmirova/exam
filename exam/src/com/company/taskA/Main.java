package com.company.taskA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Elmirova Bermet", 3.7, 19, true));
        students.add(new Student(2L, "Shygaev Maksat", 3.5, 19, false));
        students.add(new Student(3L, "Makeeva Aziza", 3.8, 19, true));
        students.add(new Student(4L, "Ulan u. Nurdin", 3.9, 19, false));
        students.add(new Student(5L, "Vigel Alena", 3.2, 19, true));
        students.add(new Student(6L, "Usmanov Azim", 3.1, 19, false));
        students.add(new Student(7L, "Temirbekova Aizirek", 4.0, 19, true));
        students.add(new Student(8L, "Ahunbaev Akmal", 3.3, 18, false));
        students.add(new Student(9L, "Etebesov Nursultan", 2.9, 19, false));
        students.add(new Student(10L, "Talaibekov Erkin", 3.8, 22, false));
        getNamesList(students).forEach(x -> System.out.println(x));
        System.out.println();
        getNamesListByAge(students, 18).forEach(x -> System.out.println(x));
        System.out.println();
        printAnonymously(students);
        getNamesFirstLetterList(students).forEach(x -> System.out.println(x));
    }

    public static List getNamesList(List<Student> students) {
        return students.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }

    public static List getNamesListByAge(List<Student> students, int minAge) {
        return students.stream()
                .filter(x -> x.getAge() > minAge)
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }

    public static void printAnonymously(List<Student> students) {
        students.stream()
                .forEach(x -> System.out.println("ID:" + x.getId() + ", Средняя оценка:" + x.getGpa()));
    }

    public static List getNamesFirstLetterList(List<Student> students) {
        return students.stream()
                .map(x -> x.getName().charAt(0) + "" + x.getName().length())
                .collect(Collectors.toList());
    }
}

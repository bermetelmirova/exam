package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        HashSet<Integer> eventArr = new HashSet<>();
        //мы знаем что в HashSet нет порядкаа
        //но я гуглила не нашла способ по порядку
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 5 == 0) {
                eventArr.add(arr[i]);
            }
        }//но почему-то если я делаю так то все добавилось в возрастающем порядке
        System.out.println(eventArr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 5 != 0) {
                eventArr.add(arr[i]);
            }
        }
        System.out.println(eventArr);
        }//можно через LinkedHashSet добавить по порядку
    }
}


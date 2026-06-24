package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("enter the size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter the data");
        ArrayList<Integer> arr = new ArrayList<>();



        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());

        }
        List<Integer> value = arr.stream()
                .filter(num->num%2==0)
                .toList();
        System.out.println("Even Numbers: " + value);
    }
}


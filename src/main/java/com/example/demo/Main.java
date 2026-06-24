package com.example.demo;
import task1.*;
import task1.Shape;
import task1.optionalQn;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Evenfind evenfind = new Evenfind();
        evenfind.Even();
        person person = new person();
        person.setName("sanjay");
        person.setAge(23);
       System.out.println( person.getName());
       System.out.println( person.getAge());
       Shape shape = new Circle();
       shape.area();
       Shape shape1 = new rectangle();
       shape1.area();
        optionalQn optionalExample = new optionalQn();

        optionalExample.run();

    }


}


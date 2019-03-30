package com.dio.persons;

/**
 * Created by vsv on 2/17/2015.
 */
public class Person1 extends Person {
    public void doSmth(){ //метод, который расширяет класс Person
        age=12;
        isMale=true;
        surname="Gusev";
        name="Vasyl"; //not visible for Person1
        Person p=new Person();
        p.age=13;
        p.isMale=false;
        p.surname="Utkin";
        p.name ="Vasyl"; //not visible- name is private field
    }
}

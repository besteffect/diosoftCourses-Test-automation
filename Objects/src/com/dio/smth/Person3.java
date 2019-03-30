package com.dio.smth;

import com.dio.persons.Person;

/**
 * Created by vsv on 2/17/2015.
 */
public class Person3 extends Person{
public void doSmth(){
    surname="Holovko";//visible- Person3 extends surname field
    name= "Olexander";// not visible - name is private field
    isMale=false;// visible, isMale is public field
    age=13; //not visible- age is package private field
    Person p=new Person();
    p.isMale=true;// visible, isMale is public field
    p.surname="Rybka";// not visible - surname is package private field
    p.name="Olexander";// not visible - name is private field
    p.age=13;//not visible.
}
}

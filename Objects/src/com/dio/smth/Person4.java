package com.dio.smth;

import com.dio.persons.Person;

/**
 * Created by vsv on 2/17/2015.
 */
public class Person4 {
    public void doSmth(){
    Person p =new Person();// visible, because it is public field
    p.isMale=true;//not visible- age is package private field
    p.age=14;//not visible- name is package private field
    p.name="Oleg";//not visible- age is package private field
    p.surname="Gusev";//not visible- surname is protected field

}
}

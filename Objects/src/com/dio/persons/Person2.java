package com.dio.persons;

/**
 * Created by vsv on 2/17/2015.
 */
public class Person2{
public void doSmth(){
    Person p=new Person();
    p.age=13;
    p.isMale=false;
    p.surname="Boyko";
    p.name="Ivan";//Person2 не расширяет класс Person. Соответственно, мы не можем обратиться прямо к полям
}
}

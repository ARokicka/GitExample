package com.company;

import java.util.Objects;

public class Osoba {
    String name;
    String surname;
    int age;
    long pesel;
    Gender gender;

    public Osoba(String name, String surname, int age, long pesel, Gender gender){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.pesel=pesel;
        this.gender=gender;
    };

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return age == osoba.age &&
                pesel == osoba.pesel &&
                Objects.equals(name, osoba.name) &&
                Objects.equals(surname, osoba.surname) &&
                gender == osoba.gender;
    }
}

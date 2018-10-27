package com.company;

import static com.company.Gender.*;

public class Main {

    public static void main(String[] args) {
        /*Dog reksio = new Dog("Reksio");
        reksio.setNumberOfLegs(3);
        System.out.println(reksio.getNumberOfLegs());
        reksio.bark();*/

        Osoba student1 = new Osoba("A","R",24,97010101456l, Gender.MALE);
        Osoba student2 = new Osoba("A","R",24,97010101456l, Gender.MALE);

        System.out.println(student1.toString());
        System.out.println(student1.equals(student2));
        /*Cube kostka = new Cube(3);
        int[] wyniki=new int [kostka.getIloscRzutow()];
        for(int i=0;i<kostka.getIloscRzutow();i++){
            wyniki[i]=kostka.rzut();
            System.out.print(wyniki[i]+",");
        String a = new String("Java");
        String b=new String("Java");
        String c = "Java";
        String d = "Java";
        System.out.println(a==b); */

    }
}


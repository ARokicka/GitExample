package com.company;

public class Cube {
    int iloscRzutow;
    public Cube(int iloscRzutow){
        this.iloscRzutow=iloscRzutow;
    }
    public int rzut() {
        int number = (int) (Math.random() * 6 + 1);
        return number;
    }
    public int getIloscRzutow(){
        return iloscRzutow;
    }
    public void setIloscRzutow(int iloscRzutow){
        this.iloscRzutow = iloscRzutow;
    }
}

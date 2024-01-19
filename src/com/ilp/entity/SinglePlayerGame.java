package com.ilp.entity;
//Liskov's Substitution Principle
public class SinglePlayerGame extends Game {
    public SinglePlayerGame(String title, String genre, double price) {
        super(title, genre, price);
    }
}


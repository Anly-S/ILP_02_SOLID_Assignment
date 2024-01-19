package com.ilp.entity;
//Liskov's Substitution Principle
public class MultiPlayerGame extends Game {
        private int maxPlayers;

        public MultiPlayerGame(String title, String genre, double price, int maxPlayers) {
            super(title, genre, price);
            this.maxPlayers = maxPlayers;
        }

        public int getMaxPlayers() {
            return maxPlayers;
        }
    }




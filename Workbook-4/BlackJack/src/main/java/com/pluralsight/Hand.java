package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        return isFaceUp ? suit : "#";
    }

    public String getValue() {
        return isFaceUp ? value : "#";
    }

    public int getPointValue() {
        if (!isFaceUp) return 0;

        return switch (value) {
            case "A" -> 11;
            case "K", "Q", "J" -> 10;
            default -> Integer.parseInt(value);
        };
    }sD

    // Optional alternate value for Ace (as 1)
    public int getAlternatePointValue() {
        if (!isFaceUp) return 0;

        if ("A".equals(value)) {
            return 1;
        }
        return getPointValue();
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

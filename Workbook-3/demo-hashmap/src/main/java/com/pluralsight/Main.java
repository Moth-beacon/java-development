package com.pluralsight;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");

        System.out.println(statesAndCapitals);

    }
}

package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";


        return fruits;
    }


    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] moreFruits = new String[size];
        for (int i = 0; i < moreFruits.length; i++) {
            moreFruits[i] = "apple";
        }
        return moreFruits;
    }


    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] topThree = new String[3];
        for (int i = 0; i < 3; i++) {
            topThree[i] = fruits[i];
        }
        return topThree;
    }


    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");
        return fruits;
    }


    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> threeFruits = new ArrayList<>();
        threeFruits.add(fruit1);
        threeFruits.add(fruit2);
        threeFruits.add(fruit3);
        return threeFruits;
    }


    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruitMap = new HashMap<>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");
        return fruitMap;
    }


    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        return fruitMap.get("apple");
    }


    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitHash = new HashSet<>();
        fruitHash.add(fruit1);
        fruitHash.add(fruit2);
        fruitHash.add(fruit3);
        return fruitHash;
    }
}


package edu.aegean.epta.java.week.two;

import java.util.*;
import java.util.stream.Collectors;

public final class DefaultMethodsExercises {

    /**
     * Given a list of StringBuilders, modify each StringBuilder
     * in-place by appending the string "new" to each one.
     * HINT: Use Iterable.forEach().
     */
    public static List<StringBuilder> appendNew(List<StringBuilder> words) {


        // TODO: change here the code.



        return words;
    }

    /**
     * Remove the words that have odd lengths from the list.
     * HINT: Collection.removeIf()
     */
    public static List<String> removeOddLengthWords(List<String> words) {

        // TODO: change here the code.


        return words;
    }

    /**
     * Replace every word in the list with its upper case equivalent.
     * HINT: Use List.replaceAll().
     */
    public static List<String> uppercaseAllWords(List<String> words) {

        // TODO: change here the code.


        return words;
    }

    /**
     * Given a map whose keys are Integers and whose values are StringBuilders,
     * append to each StringBuilder the string representation of its corresponding
     * Integer key. This should mutate each StringBuilder value in-place.
     * HINT:  Use Map.forEach().
     */
    public static Map<Integer, StringBuilder> appendToMapValues(Map<Integer, StringBuilder> input) {

        // TODO: change here the code.


        return input;
    }

    /**
     * Given a map whose keys are Integers and whose values are Strings,
     * append to each String the string representation of its corresponding
     * Integer key.
     * HINT: Map.replaceAll()
     */
    public static Map<Integer, String>replaceMapValues(Map<Integer, String> input) {

        // TODO: change here the code.



        return input;
    }

    /**
     * Given a list of words, populate a map whose keys are the lengths of
     * each word, and whose values are list of words with that length.
     * HINT: Use Map.computeIfAbsent() within Iterable.forEach().
     */
    public static Map<Integer, List<String>> mapOfListOfStringsByLength(List<String> words) {

        // TODO: change here the code.
        Map<Integer, List<String>> result = new TreeMap<>();

        return result;
    }

    /**
     * Given a list of words, populate a map whose keys are the initial characters of
     * each word, and whose values are the concatenation of the words with that
     * initial character. When concatenating the words, they should be
     * separated by a colon (':').
     * HINT: Use Map.merge() within Iterable.forEach().
     */
    public static Map<Character, String> mapOfStringByInitialCharacter(List<String> list) {

        // TODO: change here the code.
        Map<Character, String> result = new TreeMap<>();


        return result;
    }


}

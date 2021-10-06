package main.java;

import java.util.Scanner;

public class AssignmentStrAndStrBuilder {

    public static void main(String[] args) {

        String userText, word1, word2, delWord;
        char c1, c2;

        Scanner scInput = new Scanner(System.in);
        System.out.println("Please enter here your text: ");
        userText = scInput.nextLine();
//        check length :
        System.out.println(checkingNumbersOfChars(userText));
//        replacing specific character
        System.out.println("First type the specific character to be replaced press enter and then type the replacement character: ");
        c1 = scInput.next().charAt(0);
        c2 = scInput.next().charAt(0);
        userText = replaceSpecChar(userText, c1, c2);
        System.out.println(userText);
//        replacing all  equal characters
        System.out.println("First type the character to be replaced press enter and then type the replacement character:");
        c1 = scInput.next().charAt(0);
        c2 = scInput.next().charAt(0);
        userText = replaceAllChar(userText, c1, c2);
        System.out.println(userText);
//      replacing a specific word
        System.out.println("First type the specific word to be replaced press enter and then type the replacement word:");
        word1 = scInput.next();
        word2 = scInput.next();
        userText = replaceSpecPhrase(userText, word1, word2);
        System.out.println(userText);
//      replacing all equal words
        System.out.println("First type the word to be replaced press enter and then type the replacement word:");
        word1 = scInput.next();
        word2 = scInput.next();
        userText = replaceAllPhrase(userText, word1, word2);
        System.out.println(userText);
//      deleting a word
        System.out.println("Enter the word you want to delete: ");
        delWord = scInput.next();
        userText = deleteWord(userText, delWord);
        System.out.println(userText);

    }

    /**
     *
     * @param text
     * @return
     */
    public static String checkingNumbersOfChars(String text){
        if(text.length() < 500) {
            return text;
        } else {
            return "Error your text must be less than 500 characters";
        }
    }
    /**
     *
     * @param original
     * @param oldChar
     * @param newChar
     * @return
     */
    public static String replaceSpecChar(String original, char oldChar, char newChar) {

        StringBuilder result = new StringBuilder(original);
        int startIndex = original.indexOf(oldChar);
        result.replace(startIndex, startIndex+1, String.valueOf(newChar));
        return result.toString();
    }

    public static String replaceAllChar(String original, char oldChar, char newChar) {
        return original.replace(oldChar, newChar);
    }

    public static String replaceSpecPhrase(String original, String oldWord, String newWord) {

        StringBuilder result = new StringBuilder(original);
        int startIndex = original.indexOf(oldWord);
        int endIndex = startIndex + oldWord.length();
        result.replace(startIndex, endIndex, newWord);
        return result.toString();
    }

    public  static String replaceAllPhrase(String original, String oldWord, String newWord) {
        return original.replace(oldWord, newWord);
    }

    public static String deleteWord(String original, String word1) {

        StringBuilder result = new StringBuilder(original);
        int startIndex = original.indexOf(word1);
        int endIndex = startIndex + word1.length();
        result.delete(startIndex, endIndex);
        return result.toString();
    }
}

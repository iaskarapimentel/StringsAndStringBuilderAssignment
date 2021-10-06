package main.java;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AssignmentStrAndStrBuilder {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter here your text: ");
        String userText = userInput.nextLine();
        String checked = checkingNumbersOfChars(userText);
        System.out.println(checked);

        System.out.println(replaceSpecChar(checked, "O", "A"));
    }

    public static String checkingNumbersOfChars(String text){
        if(text.length() < 500) {
            return text;
        } else {
            return "Error your text must be less than 500 characters";
        }
    }


    public static StringBuilder replaceSpecChar(String original, String char1, String char2) {
        StringBuilder str1 = new StringBuilder(original);
        int startIndex = str1.indexOf(char1);
        int endIndex = str1.indexOf(char2);
        return str1.replace(startIndex, endIndex, original);
    }

//    public static void replaceAllChar(String text) {
//
//    }
//
//    public static void replaceSpecPhrase(){
//
//    }
//
//    public  static void replaceAllPhrase() {
//
//    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main function
        // Question 2
        String a = "a@b!!b$a!@$";
        String trashA = "!@$";
        String b = "?Aa#c";
        String trashB = "#?";
        //      System.out.println(trashA.replace("!!",""));
        System.out.println(checkPalindrome2(a, trashA));
//        checkPalindrome(b,trashB);
        // TODO code application logic here

    }

    public static boolean Palindrome(String sentence, String trash) {
        boolean result = true;

        //int middle = sentence.length()/2;
        for (int a = 0; a < sentence.length(); a++) {
            for (int b = 0; b < trash.length(); b++) {
                if (sentence.charAt(a) != trash.charAt(b) && b == trash.length() - 1) {
                    for (int c = sentence.length() - 1; c >= 0; c--) {
                        for (int d = 0; d < trash.length(); d++) {
                            if (sentence.charAt(c) != trash.charAt(d) && d == trash.length() - 1) {
                                if (sentence.charAt(a) == sentence.charAt(d)) {
                                } else {
                                    return false;
                                }

                            }
                        }
                    }
                }
            }

            return result;

        }
        return result;
    }

    public static boolean checkPalindrome2(String sentence, String trash) {

        boolean result = false;
        int[] array = new int[sentence.length()]; // array to store index of alphabets
        ArrayList arr = new ArrayList(); // not sure if arrayList is consider as a String to you guys, so I'll do 2 ways, using index and ArrayList
        int ind = 0, count = 0; // Since I can't get the correct array size, I will use a count variable to keep track where is the last String index stored

        for (int a = 0; a < sentence.length(); a++) {
            for (int b = 0; b < trash.length(); b++) {
                if (sentence.charAt(a) != trash.charAt(b) && b == trash.length() - 1) {
                    array[ind] += a;
                    arr.add(ind, sentence.charAt(a));
                    ind++;
                    count++;
                } else if (sentence.charAt(a) == trash.charAt(b)) {
                    b = trash.length();
                }

            }

        }

        for (int a = 0; a < count / 2; a++) { // using array that stored index of the sentence that contains alphabet
            if (sentence.charAt(array[a]) == sentence.charAt(array[count - 1])) {
                count--;
            } else {
                return result;
            }
        }

        // using Arraylist with newly stored integer, if ArrayList is not considered as a String, then this method only scan through the InputString once
        for (int a = 0; a < arr.size() / 2; a++) {
            if (arr.get(a) == arr.get(arr.size() - 1 - a)) {

            } else {
                return result;
            }
        }

        System.out.println(arr.get(0));
        return result = true;
    }

    public static boolean checkPalindrome(String sentence, String trash) { //  first attempt
        boolean result = true;
        int a = trash.length();
        //char [] array = sentence.toCharArray(); // Convert to array so it can read by index, but can't proceed with the correct method

        for (int i = 0; i < sentence.length(); i++) {

        }

        for (int b = 0; b < a; b++) {
            String rep = Character.toString(trash.charAt(b));
            sentence = sentence.replace(rep, "");
        }
        System.out.println(sentence);

        int c = sentence.length();
        for (int b = 0; b < c; b++) {
            int change = c - b - 1; // to do the reverse comparison

            if (sentence.charAt(b) == sentence.charAt(change)) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;
    }
}

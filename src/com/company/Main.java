package com.company;

public class Main {

    public static void main(String[] args) {
	    String word = "Deleveled";
	    System.out.println(PalindromeCheck(word));
    }

    public static int PalindromeCheck(String word){

        word = word.toLowerCase();

        int countForward = 0;
        int countBack = word.length() -1;

        while(countBack > countForward) {
            if (!(word.substring(countForward, countForward + 1).matches(word.substring(countBack, countBack + 1)))) {
                return 0;
            }
            countBack --;
            countForward++;
        }
        return 1;
    }

}

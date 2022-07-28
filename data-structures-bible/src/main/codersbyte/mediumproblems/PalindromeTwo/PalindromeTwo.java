package main.codersbyte.mediumproblems.PalindromeTwo;

import java.util.Scanner;

public class PalindromeTwo {
    public static boolean PalindromeTwoFunc(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]","");

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != (str.charAt(str.length()-i - 1))) { return false;}
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwoFunc(s.nextLine()));
    }
}

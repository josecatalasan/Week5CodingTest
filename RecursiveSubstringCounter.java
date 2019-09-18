package com.example.week3codingtest;

public class RecursiveSubstringCounter {

    public static void main(String[] args) {
        String string = "lololol";
        String substring = "lol";

        System.out.println(strCopies(string, substring, 3));
        System.out.println(strCopies(string, substring, 4));
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }

    public static boolean strCopies(String string, String substring, int N){
        return strCopiesHelper(string, substring, N, 0) >= N;
    }

    public static int strCopiesHelper(String string, String substring, int N, int count){
        if(string.isEmpty() || string.length()<substring.length() || count >= N){
            return count;
        } else if (string.indexOf(substring) == 0){
            return strCopiesHelper(string.substring(1), substring, N, count+1);
        } else {
            return strCopiesHelper(string.substring(1), substring, N, count);
        }
    }
}

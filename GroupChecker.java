package com.example.week3codingtest;

import java.util.Stack;

public class GroupChecker {

    public static final String openings = "([{";
    public static final String endings = ")]}";

    public static void main(String[] args) {

        System.out.println(groupingCheck("({})[]"));
        System.out.println(groupingCheck("[]{]}["));
        System.out.println(groupingCheck("([{]})"));

    }

    public static boolean groupingCheck(String string){
        Stack<Character> checkStack = new Stack<>();

        for(int i=0; i<string.length(); i++){
            char check = string.charAt(i);
            if(checkStack.isEmpty()){
                checkStack.add(check);
            } else if(endings.contains("" + checkStack.peek())){
                return false;
            } else if(openings.indexOf(checkStack.peek()) == endings.indexOf(check)){
                checkStack.pop();
            } else {
                checkStack.add(check);
            }
        }
        return checkStack.isEmpty();
    }
}

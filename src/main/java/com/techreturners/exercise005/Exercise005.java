package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {

        Set<Character> alphabet=new HashSet<>();
        for(char c='a';c<='z';c++){
            alphabet.add(c);
        }
        for(char c:input.toLowerCase().toCharArray()){
            if(Character.isLetter(c)||c=='_'|| Character.isDigit(c) || !Character.isAlphabetic(c)){
                alphabet.remove(c);
            }
        }
        return alphabet.isEmpty();
        //return alphabet.size()==26;

    }

}

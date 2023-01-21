package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < allAlphabets.length(); i++) {
            if (input.contains(allAlphabets.substring(i, i + 1))) {
                if (i == 25)
                    return true;
            } else
                break;
        }
        return false;
    }

}

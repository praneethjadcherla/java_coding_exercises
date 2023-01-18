package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        if (Character.isUpperCase(word.charAt(0)))
            return word;
        else
            return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double vat = originalPrice + ((vatRate / 100) * originalPrice);
        return (Math.round(vat * 100.0) / 100.0);
    }

    public String reverse(String sentence) {
        // Add your code here
        String afterReverse = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            afterReverse = afterReverse + sentence.charAt(i);
        }
        return afterReverse;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;
        for (User u : users) {
            if (u.getType() == "Linux")
                count++;
        }
        return count;
    }
}

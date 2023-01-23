package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if (Character.isUpperCase(word.charAt(0)))
            return word;
        else
            return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = originalPrice + ((vatRate / 100) * originalPrice);
        return (Math.round(vat * 100.0) / 100.0);
    }

    public String reverse(String sentence) {
        StringBuilder reverseString = new StringBuilder(sentence);
        return reverseString.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        long count_Linux_users = users
                .stream()
                .filter(u -> u.getType().equals("Linux"))
                .count();
        return (int) count_Linux_users;
    }
}

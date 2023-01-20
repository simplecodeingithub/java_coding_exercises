package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return (firstName.substring(0,1)+"."+lastName.substring(0,1)).toUpperCase();
        //return Character.toUpperCase(firstName.charAt(0))+"."+lastName.charAt(0);

    }

    public double addVat(double originalPrice, double vatRate) {
        double vatAmount=originalPrice * (vatRate/100);
        double finalPrice=originalPrice +vatAmount;
        DecimalFormat decimalFormat=new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(finalPrice));

    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count=0;
        for(User user:users){
            if(user.getType().equals("Linux")){
                count++;
            }
        }
        return count;
    }
}

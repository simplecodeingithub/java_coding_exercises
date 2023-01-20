package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        if (iceCreamFlavour.equals("Raspberry Ripple")) {
            return 1;
        } else if (iceCreamFlavour.equals("Mint Chocolate Chip")) {
            return 3;
        } else if (iceCreamFlavour.equals("Mango Sorbet")) {
            return 5;
        } else {
            throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
        }
    }
    String[] iceCreamFlavours() {
        String[] iceCreamFlavours={ "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return iceCreamFlavours;
        //throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}

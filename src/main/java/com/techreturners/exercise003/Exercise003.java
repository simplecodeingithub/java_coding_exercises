package com.techreturners.exercise003;

public class Exercise003 {

    String[] flavours={ "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    int getIceCreamCode(String iceCreamFlavour) {
        for(int i =0;i<flavours.length;i++){
            if(flavours[i].equalsIgnoreCase(iceCreamFlavour)){
                return i;
            }
        }
        return -1;
    }
   String[] iceCreamFlavours() {
        String[] iceCreamFlavours={ "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return flavours;

    }

}

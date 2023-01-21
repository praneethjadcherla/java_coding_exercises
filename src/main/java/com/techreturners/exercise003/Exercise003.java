package com.techreturners.exercise003;


public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
       int icecreamCode=-1,i=0;
       while(i<iceCreamFlavours().length){
           if(iceCreamFlavours()[i].equals(iceCreamFlavour)) {
               icecreamCode = i;
               break;
           }
           i++;
       }
       return icecreamCode;
    }

    String[] iceCreamFlavours() {
        String[] Flavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return Flavours;
    }
}

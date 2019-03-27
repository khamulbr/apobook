package com.dias.alessandro.apobook.guitars;

import java.util.Iterator;
import java.util.LinkedList;

public class FindGuitarTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);

        LinkedList matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin you might like these guitars: " );
            for (Iterator i = matchingGuitars.iterator(); ((Iterator) i).hasNext(); ){
                Guitar guitar = (Guitar) i.next();
                GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.out.println("We have a " +
                        guitarSpec.getBuilder() +
                        " " +
                        guitarSpec.getModel() +
                        " " +
                        guitarSpec.getType() +
                        " guitar with "+
                        guitarSpec.getNumStrings()+
                        " strings:\n" +
                        guitarSpec.getBackWood() + " in the back and sides, \n" +
                        guitarSpec.getTopWood() + " in the top. \nIt could be yours for only US$" +
                        guitar.getPrice() + "!\n --"
                );
            }
        } else {
            System.out.println("Seems like we have nothing for you");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.95, 6);
        inventory.addGuitar("V95694", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1549.95, 6);
    }


}
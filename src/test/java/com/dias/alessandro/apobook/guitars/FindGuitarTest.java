package com.dias.alessandro.apobook.guitars;

public class FindGuitarTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);

        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin maybe you like this " +
                    guitar.getBuilder() +
                    " " +
                    guitar.getModel() +
                    " " +
                    guitar.getType() +
                    " guitar:\n" +
                    guitar.getBackWood() + " in the back and sides, \n" +
                    guitar.getTopWood() + " in the top. \nIt could be yours for only US$" +
                    guitar.getPrice() + "!"
            );
        } else {
            System.out.println("Seems like we have nothing");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.95);
    }


}
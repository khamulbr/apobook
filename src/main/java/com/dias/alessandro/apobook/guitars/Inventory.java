package com.dias.alessandro.apobook.guitars;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price, int numStrings) {
        GuitarSpec guitarSpec = new GuitarSpec( builder, model, type, backWood, topWood, numStrings);
        Guitar guitar = new Guitar(serialNumber,price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public LinkedList search(GuitarSpec searchGuitar) {
        LinkedList matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();

            if (matches(searchGuitar, guitarSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    private boolean matches(GuitarSpec searchGuitar, GuitarSpec guitarSpec) {
        if (searchGuitar.getBuilder() != guitarSpec.getBuilder())
            return false;
        String model = searchGuitar.getModel().toLowerCase();
        if (model != null && (!model.equals("")) && !model.equals(guitarSpec.getModel().toLowerCase())) {
            return false;
        }
        if (searchGuitar.getType() != guitarSpec.getType())
            return false;
        if (searchGuitar.getBackWood() != guitarSpec.getBackWood())
            return false;
        if (searchGuitar.getTopWood() != guitarSpec.getTopWood())
            return false;
        return true;
    }
}

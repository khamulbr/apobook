package com.dias.alessandro.apobook.dogdoor;

public class DogDoor {

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("a porta do cachorro abre");
        this.open = true;
    }

    public void close(){
        System.out.println("a porta do cachorro fecha");
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }
}

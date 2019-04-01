package com.dias.alessandro.apobook.dogdoor;

public class Remote {

    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressionado o botao de controle remoto");
        if (door.isOpen()){
            door.close();
        } else {
            door.open();
        }
    }

}

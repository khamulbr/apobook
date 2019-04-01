package com.dias.alessandro.apobook.dogdoor;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido late para sair");
        remote.pressButton();
        System.out.println("\nFido saiu");
        remote.pressButton();
        System.out.println("\nFido ja terminou");
        remote.pressButton();
        System.out.println("\nFido voltou para dentro");
        remote.pressButton();
    }


}

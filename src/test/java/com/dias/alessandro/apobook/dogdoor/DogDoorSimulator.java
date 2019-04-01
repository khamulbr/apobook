package com.dias.alessandro.apobook.dogdoor;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido late para sair");
        remote.pressButton();
        System.out.println("\nFido saiu");
        System.out.println("\nFido ja terminou");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nMas ele esta preso la fora");
        System.out.println("\nEle comeca a latir");
        System.out.println("\nEntao Gina pega o controle remoto");
        remote.pressButton();
        System.out.println("\nFido voltou para dentro");
    }
}

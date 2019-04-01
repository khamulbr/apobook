package com.dias.alessandro.apobook.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

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

            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    door.close();
                    timer.cancel();
                }
            }, 5000);

        }
    }

}

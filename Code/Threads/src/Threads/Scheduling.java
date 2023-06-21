package Threads;
//Alle 5 Sekunden soll es wiederholt werden.
import java.util.*;
public class Scheduling {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

        timer.schedule(task, 5000,3000);

    }//Ende Main
}//Ende Klasse

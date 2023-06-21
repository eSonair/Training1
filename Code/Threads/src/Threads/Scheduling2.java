package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.*;


public class Scheduling2 {

    public static void main(String[] args) {
        ScheduledExecutorService ex = Executors.newSingleThreadScheduledExecutor();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };
        ex.scheduleAtFixedRate(task, 5, 2, TimeUnit.SECONDS);  //hier keine Millisekunden, sondern Sekunden

    }//Ende Main
}//Ende Klasse

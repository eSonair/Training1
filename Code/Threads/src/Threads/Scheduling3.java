package Threads;
//Hier wollen wir d. Threads begrenzen. So, dass nur dieser eine Thread möglich ist.

import java.util.concurrent.Semaphore;



public class Scheduling3 {

    public static void main(String[] args) {

        Semaphore sm = new Semaphore(2); // 2 Threads können auf d. Ressource zugreifen.
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    sm.acquire(); //acquire sagt, dass es starten soll
                    System.out.println("Thread gestartet: " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("Thread beendet"+Thread.currentThread().getName());
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    sm.release(); //Löschen v. SM ähnlich wie flush, damit es geleert wird
                }
            }
        };

        for (int i=0;i<5; i++){
            Thread thread = new Thread(task);
            thread.start();
        }
    }//Ende main
}//Ende Klasse

package Threads;

public class Synchronized {


    private int count=0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Synchronized counter = new Synchronized();


        for (int i=0; i<1000; i++){  //hier starten wir 1000 Threads deswegen synchronisieren wir alles auf einmal
            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.increment();
                }
            });
            th.start();
        }

        try{  //Brauchen wir, damit wir nicht bereits den Counter ausgeben, obwohl d. Threads noch nicht fertig abgehandelt sind.
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

    }//Ende Main
}//Ende Klasse

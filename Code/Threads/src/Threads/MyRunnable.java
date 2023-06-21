package Threads;

public class MyRunnable implements Runnable{

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("MyRunnable is running..... ");

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }//Ende Catch
        System.out.println("Thread" + name + " is done");
    }//Ende Methode run.
}//Ende Klasse

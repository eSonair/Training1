package Threads;

public class MyThread extends Thread {
    //Thread enthält d. Interace Runable

    public void run(){
        System.out.println("MyThread running....");
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable("Thread 1");
        MyRunnable runnable2 = new MyRunnable("Thread 2");
        MyThread thread = new MyThread();
        //thread.start();
        Thread th = new Thread(runnable); //= d. Gleiche wie hier d. Methode "public void run()"
        Thread th2 = new Thread(runnable2);
        //th.run();
        th.start(); //.start verwendet auch d. Methode "run()" im Runnable, start macht noch zusätzliche Sachen. Auch wenn es Run aufruft
        th2.start();
        System.out.println("--------------------");
        //thread.start();
        //thread.test(); //thread start u. thread test passieren gleichzeitig, beides ist eine Nebenläufigkeit
        //thread.run();
        /*
        In der Klasse Thread sorgt die Methode "synchronized" dafür, dass wir alles was wir ausführen möchten
        dann auch irgendwann ausgeführt wird. Sobald synchronized gestartet wird, werden alle anderen Methoden pausiert.
         */
    }//Ende Main

    public void test(){
        System.out.println("Test");
    }
}//Ende Klasse

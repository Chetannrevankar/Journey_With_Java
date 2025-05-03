class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());    }}}

public class Multithreading {
    public static void main(String[] args) {
        MyRunnable myTask = new MyRunnable();  // Create object of class
        Thread t1 = new Thread(myTask);         // Wrap inside Thread object
        Thread t2 = new Thread(myTask);

        t1.start();  // Start first thread
        t2.start();  // Start second thread     }}

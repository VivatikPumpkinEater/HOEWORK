package by.academy.classwork.thread.hw_THREAD;

public class ThreadTask {

    static int failCount = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        try {
            while (t1.isAlive() && failCount < 5) {
                failCount++;
                t1.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (t1.isAlive() && failCount == 5){
            System.out.println("все плохо");
        }else{
            System.out.println("все хорошо");
        }
        System.out.println("Done");
    }
}

package MultiThreading;

public class EvenThread extends Thread {

    public EvenThread(String name) {
        super(name);
        System.out.println("Thread details:" + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(super.getName() + ":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println(super.getName() + " interrupted!");
        }
        System.out.println(super.getName() + " finished!");
    }

}

class UseThread1 {

    public static void main(String[] args) {
        EvenThread obj = new EvenThread("child thread");
        obj.start();
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("main thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("main thread interrupted!");
        }
        System.out.println("main thread finished!");
    }
}

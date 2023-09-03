package aug31.thread;

public class ThreadRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int y=0; y<10; y++){
                    System.out.print("y:"+ y+ "  ");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread = new Thread(()-> System.out.println("thread is running"));
        thread.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int x=0; x<10; x++){
            System.out.print("x:"+ x+ "  ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

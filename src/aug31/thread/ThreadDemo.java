package aug31.thread;


//1. extending thread class
public class ThreadDemo extends Thread{
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

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        for(int y=0; y<10; y++){
            System.out.print("y:"+ y+ "  ");

            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

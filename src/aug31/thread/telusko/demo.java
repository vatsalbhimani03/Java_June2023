package aug31.thread.telusko;


class A extends Thread{
    public void run(){
        for (int i=1; i<=100; i++){
            System.out.println("hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i=1; i<=100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        System.out.println(obj1.getPriority()); // by default priority is 5, min is 0, max is 10.
//        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}

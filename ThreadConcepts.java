//class N extends Thread {
class N implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//class K extends Thread{
class K implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadConcepts {
    public static void main(String[] args){
//        N obj1=new N();              /* when class extends thread*/
//        K obj2=new K();
//        System.out.println(obj1.getPriority());
//        obj1.start();
//        try {
//            Thread.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        obj2.start();

        Runnable obj1=new N();
        Runnable obj2=new K();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

    }
}

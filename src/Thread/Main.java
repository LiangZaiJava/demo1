package Thread;

public class Main {
    public static void main(String[] args) {
//        Thread myThread1 = new Thread(new MyThread("线程1"),"线程A");
//        Thread myThread2 = new Thread(new MyThread("线程2"),"线程B");
//        myThread1.start();
//        System.out.println("main");
//        myThread1.setName("setName1");
//
//        myThread2.start();
        SubThreadAlive t = new SubThreadAlive();
        System.out.println("begin==" +t.isAlive());
        t.start();
        System.out.println("after==" +t.isAlive());

    }
}

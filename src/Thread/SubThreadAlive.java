package Thread;

public class SubThreadAlive extends Thread {
    public void run(){
        System.out.println("run 方法,isAlive=" + this.isAlive());
    }
}

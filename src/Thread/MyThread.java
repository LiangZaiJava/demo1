package Thread;

public class MyThread implements Runnable {
    private String title;
    public MyThread(String title){
        this.title = title;
    }
    @Override
    public void run(){

            //System.out.println(this.title+"正在运行"+ i);
            System.out.println(Thread.currentThread().getName());
    }

}

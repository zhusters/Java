package Multithreading;

public class test1 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new test1());
        t.start();
        t.join();
        System.out.println("the end");
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

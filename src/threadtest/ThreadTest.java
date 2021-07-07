package threadtest;

class MyThread extends Thread
{
    public void run()
    {
        int count = 0;
        while(true)
        {
            System.out.println(count++);
        }
    }
}

public class ThreadTest
{
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        Thread mainThread = Thread.currentThread();
        mainThread.join();
    }
}
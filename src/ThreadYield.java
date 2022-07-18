public class ThreadYield {
    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            Thread thread = Thread.currentThread();
            System.out.println("MyRunnable class run method is being executed by"+thread.getName());
            for (int i = 0; i < 10; i++) {
                System.out.println("performing task "+i+" by "+thread.getName());
                if(i==5){
                    Thread.yield();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable,"MyThread1");
        thread1.start();
        Thread thread2 = new Thread(myRunnable,"MyThread2");
        thread2.start();
    }
}

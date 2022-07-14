public class ThreadPriority {
    static class MyThreadClass implements Runnable{

        @Override
        public void run() {
            System.out.println("Count down begins.....");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread countDown = new Thread(new MyThreadClass());
        //countDown.setPriority(Thread.MAX_PRIORITY);
        //After commenting above line, both countDown and main thread has same priority as countDown thread has inherited the priority from its parent
        //Since both thread have same priority, any thread can execute first.
        countDown.start();
        System.out.println("Welcome to Zurrasic Park");
        }
    }

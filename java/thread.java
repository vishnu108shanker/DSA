import java.util.concurrent.Semaphore;

public class thread {


    static class Resource {
        Semaphore sem = new Semaphore(2); // 2 permits

        void use() {
            try {
                sem.acquire(); // take permit

                System.out.println(Thread.currentThread().getName() + " is using resource");
                Thread.sleep(1000); // simulate work

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sem.release(); // give permit back
            }
        }
    }


        public static void main(String[] args) {
            Resource r = new Resource();

            for (int i = 1; i <= 5; i++) {
                new Thread(() -> r.use(), "Thread-" + i).start();
            }
        }

}

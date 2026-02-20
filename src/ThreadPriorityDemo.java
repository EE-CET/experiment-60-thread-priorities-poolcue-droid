class PriorityThread extends Thread {
    public void run() {
        // No execution needed
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create threads
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Print priorities (exact format required)
        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
        System.out.println("Thread 3 Priority: " + t3.getPriority());
    }
}
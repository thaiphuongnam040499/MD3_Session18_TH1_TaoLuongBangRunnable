public class Main {
    public static void main(String[] args) {
        System.out.println("main thread running");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.run();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-HR-Email");
        runnableDemo2.run();
        System.out.println("Main thread stopped");
    }
}

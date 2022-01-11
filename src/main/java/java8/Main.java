package java8;

public class Main {
    public static void main(String[] args) {

        Runnable run = new Runnable() {
            @Override
            public void run() {
            System.out.println("Hello World");
            }
        };

        new Thread(run).start();

        Runnable run1 = () -> System.out.println("Hello men");
        new Thread(run1).start();
    }
}

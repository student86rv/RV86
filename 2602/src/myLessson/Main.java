package myLessson;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("other");
                
            }
        };


        System.out.println("before");
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("after");
    }
}

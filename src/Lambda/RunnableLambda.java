package Lambda;

public class RunnableLambda {

    public void runLambda() throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<3; i++){
                    System.out.println("Hello world from thread["+Thread.currentThread().getName()+"]");
                }
            }
        };

        Runnable runnable1 = () -> {
            for(int i=0; i<3; i++){
                System.out.println("Hello world from thread["+Thread.currentThread().getName()+"]");
            }
        };
        Thread thread = new Thread(runnable1);
        thread.start();
        thread.join();
    }

}

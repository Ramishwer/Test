package test.array.mutithreading;

public class MyThread implements Runnable{

    @Override
    public void run() {

        for(int i=0;i<10;i++){
            System.out.println("Runnable"+ i);
        }
    }

    public static void main(String[] args){

        MyThread myThread=new MyThread();

        Thread thread=new Thread(myThread);

        UsingThread usingThread=new UsingThread();
        usingThread.start();

        thread.start();
    }
}

package test.array.mutithreading;

public class UsingThread extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Using THread:"+i);
        }
    }


    public static void main(String[] args) {
        UsingThread usingThread=new UsingThread();
        usingThread.start();
    }

}

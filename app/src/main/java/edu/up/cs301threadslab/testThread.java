package edu.up.cs301threadslab;
import java.lang.Thread;

public class testThread extends java.lang.Thread{
    Thread t;
    private AnimationView AV;
    public StarAnimation SA;

    public testThread(AnimationView v, StarAnimation sa){
        AV = v;
        SA = sa;
    }

    @Override
    public void run() {
        synchronized (SA) {
            while (true) {
                try {
                    this.AV.postInvalidate();
                    Thread.sleep(50);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

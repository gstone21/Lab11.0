package edu.up.cs301threadslab;
import java.lang.Thread;

public class testThread extends java.lang.Thread{
    Thread t;
    private AnimationView AV;

    public testThread(AnimationView v){
        AV = v;
    }

    @Override
    public void run(){
        while(true) {
            try {
                this.AV.postInvalidate();
                Thread.sleep(50);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}

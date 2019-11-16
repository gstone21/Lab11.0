package edu.up.cs301threadslab;

import java.util.Random;

public class TestThread2 extends Thread {
    private StarAnimation sa;

    public TestThread2(StarAnimation sa) {
        this.sa = sa;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (sa) {
                    Random num = new Random();
                    int addOrRemove = num.nextInt(2);
                    if (addOrRemove == 0) {
                        sa.addStar();
                    } else {
                        sa.removeStar();
                    }
                    Thread.sleep(2);
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

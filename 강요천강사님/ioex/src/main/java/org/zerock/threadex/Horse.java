package org.zerock.threadex;

public class Horse extends Thread {

    private String name;
    private int pos;

    public Horse(String name) {
        this.name = name;
        this.pos = 0;
    }

    @Override
    public void run() {
        this.gallop();
    }

    public void gallop() {
        for(int i = 0; i < 100; i++) {

            int range = (int)(Math.random() * 10) + 1;

            this.pos += range;

            synchronized (System.out) {
                int count = this.pos/10;
                for(int j = 0; j < count; j++) {
                    System.out.print(".");
                }
                System.out.println(this.name + ": " + this.pos);
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//end for

    }

    public static void main(String[] args) {

        Horse h1 = new Horse("최한빛말");
        Horse h2 = new Horse("이아현말");

        h1.start();
        h2.start();
    }
}

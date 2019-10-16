package com.example.task;


public class Th  {

    private static int c = 0;

    public static void main(String[] args) {

        Runnable r = ()->{
            c = 1 + 3;
            System.out.println(c);
        };

        Runnable r1 = ()->{
            try {
                Thread.sleep(20);
            }catch (InterruptedException e){

            }
            c = 3 + 3;
            System.out.println(c);

        };

        Thread thd2 = new Thread(r1);
        thd2.start();
        Thread thd = new Thread(r);
        thd.start();

        try {
            thd.join();
            thd2.join();
        }catch (InterruptedException ie){

        }

        System.out.println(c);
    }



}


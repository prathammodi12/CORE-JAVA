package com.pratham.corejava.MultiThreading;

public class MyThread extends Thread {
    @Override
    public void run() {

    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println(t1.getState());
    }// start , sleep , intruppt , yield, run ,join, setDaemon

    //Daemon Thread running iin background

    //Lock, unlock, reentretent lock, try lock, deadlock prevention, lock intreptibility, unfair lock,fairnessoflock, blocking, readwrite locking
}

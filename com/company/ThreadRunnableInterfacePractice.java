package com.company;

class Biscuit implements Runnable{
    public void run(){
        while(true){
            System.out.println("This is Biscuit class");
        }
    }
}
class Namkeen implements Runnable{
    public void run(){
        while(true) {
            System.out.println("This is namkeen class");
        }
    }
}

public class ThreadRunnableInterfacePractice {
    public static void main(String[] args) {
        Biscuit bullet1 = new Biscuit();
        Thread gun1 = new Thread(bullet1);
        Namkeen bullet2 = new Namkeen();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}

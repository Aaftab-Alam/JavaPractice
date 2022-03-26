package com.company;
class Bread extends Thread{
    static int count=0;

    @Override
    public void run(){
        while(true) {
            System.out.println("I am Bread...");
            count+=1;
            if(count==100){
                break;
            }
        }
    }
    void printVal(){
        System.out.println("Bread is"+count);
    }
}
class Cake extends Thread{
    public int countc=0;
    public void run(){
        while(true){
            System.out.println("I am Cake");
            countc+=1;
            if(Bread.count==100){
                break;
            }
        }
    }
    void printVal(){
        System.out.println("Cake is"+countc);
    }
}
public class ThreadPractice {
    public static void main(String[] args) {
        int count1=0;
        Bread t1= new Bread();
        Cake t2= new Cake();
        //t1.setPriority(2);
        //t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Bread value"+ Bread.count);
        t1.printVal();
        t2.printVal();
    }
}

package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
abstract class Telephone{
    abstract void lift();
    abstract void disconnected();
}
class SmartTelephone extends Telephone{
    void lift(){
        System.out.println("Call picked...");
    }
    void disconnected(){
        System.out.println("Call disconnected...");
    }
}
interface TVremote{
    void remote();
}
interface SmartTVremote extends TVremote{
    void smartRemote();
}
class TV implements SmartTVremote{
    @Override
    public void smartRemote(){
        System.out.println("This is a smart remote...");
    }

    @Override
    public void remote() {
        System.out.println("This is a simple remote...");
    }
}
public class AbstractPracticeSets {
    public static void main(String[] args) {
        FountainPen obj5=new FountainPen();
        obj5.write();
        obj5.changeNib();

        TV tv= new TV();
        tv.remote();
        tv.smartRemote();
    }
}

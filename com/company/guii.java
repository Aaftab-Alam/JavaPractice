package com.company;
import java.awt.*;
public class guii{

    guii(){
        Frame f= new Frame();
        f.setSize(300,300);
        Button b= new Button("Submit");
        Label l=new Label("Employee");
        b.setBounds(180,100,50,50);
        l.setBounds(150,100,50,50);
        f.add(b);
        f.add(l);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        guii g=new guii();
    }
}

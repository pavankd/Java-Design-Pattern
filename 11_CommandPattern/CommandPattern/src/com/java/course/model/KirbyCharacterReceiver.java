package com.java.course.model;

public class KirbyCharacterReceiver {
    private String name;

    public KirbyCharacterReceiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp(){
        System.out.println(getName()+" is jumping up");
    }
    public void moveLeft(){
        System.out.println(getName()+" is moving left");
    }
    public void moveRight(){
        System.out.println(getName()+" is moving right");
    }
    public void moveDown(){
        System.out.println(getName()+" is moving down");
    }
}

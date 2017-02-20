package com.example.apple.myapplication;

/**
 * Created by apple on 17/2/20.
 */

public class Dog {

            private String name;
             private int imageId;

    public Dog(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}

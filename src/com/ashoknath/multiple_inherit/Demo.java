package com.ashoknath.multiple_inherit;

/**
 * Created by DELL on 2/1/2019.
 */
public class Demo implements Shape,Color {

    @Override
    public void getColor() {
        System.out.println("color");
    }

    @Override
    public void getShape() {
        System.out.println("shape.");
    }

    public static void main(String[] args) {
     Demo demo=new Demo();
        demo.getColor();
        demo.getShape();
    }


}

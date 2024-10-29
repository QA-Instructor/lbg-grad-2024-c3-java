package com.lbg.classes;

public interface ISteerable {
    String turnLeft();

    String turnRight();

    default String brandNewMethod(){
        return "Aaryan added this later";
    }
}

package com.wx;

public interface eat {
    public void eat();
    default public void drink(){
        System.out.println("吃饭就要喝点水？？？？？？？？？");
    }
}

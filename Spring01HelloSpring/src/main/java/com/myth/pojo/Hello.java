package com.myth.pojo;

/**
 * @author myth
 * @Date 2020-06-20 18:46
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("Hello,"+ name );
    }
}

package com.leo.bytecode.asm.learn.run;

public class HelloWorldRun {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.leo.bytecode.asm.learn.sample.HelloWorld");
        Object instance = clazz.newInstance();
        System.out.println(instance);
    }
}

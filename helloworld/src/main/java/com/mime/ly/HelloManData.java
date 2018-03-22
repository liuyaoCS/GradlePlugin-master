package com.mime.ly;

import org.gradle.api.tasks.Input;

/**
 * <p>write the description
 *
 * @author houyi
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */


public class HelloManData {
    private String name;
    private int age;

    public HelloManData(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Input
    public String getName() {
        return name;
    }

    @Input
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Hello "+age+" years old "+name+" !";
    }
}

package com.zhujianbiao;

public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        System.out.println("person有参构造 ............");
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("person无参构造 ............");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package org.sadan.comparator;

public class Person implements Comparable<Person>{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Person o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public String toString(){
        return "[age=" + age + ", name=" + name + "]";
    }

    public int ageDifference ( final Person other) {
        return age - other.age;
    }
}

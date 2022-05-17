package encapsulations;

import accessmodifiers.Test;

public class Student {

    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.name = age;
    }

    public void setAddress(String address){
        this.name = address;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public String formatCred(){
        return  ("Student name is " +
                this.getName() +
                ", age is: " +
                this.getAge() +
                " and address is: "+
                this.getAddress());
    }

    public  static void main(String[] args){
        Student john = new Student("John", 29, "3, ford close, vi,lagos.");
        System.out.println(john.formatCred());
        System.out.println(john.getAddress());

        Test t = new Test();
        t.display();

    }


}

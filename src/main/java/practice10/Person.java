package practice10;

public class Person {
    private  String name;
    private int age;
    private int id;

    public Person(int id, String name, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}

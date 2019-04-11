package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> linkedList;

    public Teacher(int id,String name, int age){
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public LinkedList getClasses() {
        return this.linkedList;
    }

    public String introduce(){
        if(this.linkedList == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class "+ eachLinkedList(this.linkedList) + ".";
    }

    public String introduceWith(Student student){
        if(this.isTeaching(student)){
            return  super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public String eachLinkedList(LinkedList<Klass> linkedList){
        StringBuilder classes = new StringBuilder();
        for (int i = 0; i < linkedList.size(); i++){
            if(i == linkedList.size() - 1){
                classes.append(linkedList.get(i).getNumber());
            }else {
                classes.append(linkedList.get(i).getNumber() + ", ");
            }
        }
        return classes.toString();
    }

    public boolean isTeaching(Student student){
        for (int i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i).getNumber() == student.getKlass().getNumber()){
               return true;
            }
        }
        return false;
    }
}

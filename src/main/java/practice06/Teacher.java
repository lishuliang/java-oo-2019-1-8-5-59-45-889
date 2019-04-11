package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age){
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce(){
        if(this.klass == 0){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class "+ this.klass + ".";
    }
}
